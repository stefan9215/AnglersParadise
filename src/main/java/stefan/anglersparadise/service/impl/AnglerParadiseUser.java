package stefan.anglersparadise.service.impl;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import stefan.anglersparadise.model.entity.UserEntity;
import stefan.anglersparadise.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnglerParadiseUser implements UserDetailsService {

    private final UserRepository userRepository;

    public AnglerParadiseUser(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository
                .findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User with" + username + "not found!"));

        return mapToUserDetails(userEntity);
    }

    private static UserDetails mapToUserDetails(UserEntity userEntity) {

        List<GrantedAuthority> authorities =
                userEntity.getRoles()
                        .stream()
                        .map(r -> new SimpleGrantedAuthority("ROLE_" + r.getRole().name()))
                        .collect(Collectors.toList());

        return new User(
                userEntity.getUsername(),
                userEntity.getPassword(),
                authorities
        );
    }
}
