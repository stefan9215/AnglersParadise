package stefan.anglersparadise.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import stefan.anglersparadise.model.dto.UserRegisterDTO;
import stefan.anglersparadise.model.entity.UserEntity;
import stefan.anglersparadise.model.entity.enums.RoleNameEnum;
import stefan.anglersparadise.repository.UserRepository;
import stefan.anglersparadise.repository.UserRoleRepository;
import stefan.anglersparadise.service.UserRegisterService;

import java.util.Set;

@Service
public class UserRegisterServiceImpl implements UserRegisterService {

    private final UserRepository userRepository;
    private final UserRoleRepository userRoleRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;
    private final UserDetailsService userDetailsService;

    public UserRegisterServiceImpl(UserRepository userRepository, UserRoleRepository userRoleRepository, ModelMapper modelMapper, PasswordEncoder passwordEncoder, UserDetailsService userDetailsService) {
        this.userRepository = userRepository;
        this.userRoleRepository = userRoleRepository;
        this.modelMapper = modelMapper;
        this.passwordEncoder = passwordEncoder;
        this.userDetailsService = userDetailsService;
    }

    @Override
    public void createAccount(UserRegisterDTO userRegisterDTO) {

        UserEntity userEntity = modelMapper.map(userRegisterDTO, UserEntity.class);
        userEntity.setPassword(passwordEncoder.encode(userRegisterDTO.getPassword()))
                .setRoles(Set.of(userRoleRepository.findByRole(RoleNameEnum.USER)));

        userRepository.save(userEntity);

        UserDetails userDetails = userDetailsService.loadUserByUsername(userRegisterDTO.getUsername());
        Authentication authentication = new UsernamePasswordAuthenticationToken(
                userDetails,
                userDetails.getPassword(),
                userDetails.getAuthorities()
        );

        SecurityContextHolder.
                getContext().
                setAuthentication(authentication);
    }
}
