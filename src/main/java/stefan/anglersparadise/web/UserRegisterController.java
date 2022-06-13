package stefan.anglersparadise.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import stefan.anglersparadise.model.dto.UserRegisterDTO;
import stefan.anglersparadise.service.UserRegisterService;

import javax.validation.Valid;

@Controller
@RequestMapping("/users")
public class UserRegisterController {

    private final UserRegisterService userRegisterService;

    public UserRegisterController(UserRegisterService userRegisterService) {
        this.userRegisterService = userRegisterService;
    }

    @GetMapping("/register")
    public String register() {

        return "auth-register";
    }

    @PostMapping("/register")
    public String confirmRegister(@Valid UserRegisterDTO userRegisterDTO, BindingResult bindingResult,
                                  RedirectAttributes redirectAttributes) {

        boolean equalPasswords = userRegisterDTO.getPassword().equals(userRegisterDTO.getConfirmPassword());
        boolean usernamePresent = userRegisterService.isUsernamePresent(userRegisterDTO.getUsername());
        boolean emailPresent = userRegisterService.isEmailPresent(userRegisterDTO.getEmail());

        if(bindingResult.hasErrors() || !equalPasswords || usernamePresent || emailPresent) {

            addFlashAttributes(userRegisterDTO, bindingResult,
                    redirectAttributes, equalPasswords, usernamePresent, emailPresent);

            return "redirect:register";
        }

        userRegisterService.createAccount(userRegisterDTO);

        return "redirect:/";
    }

    private void addFlashAttributes(UserRegisterDTO userRegisterDTO, BindingResult bindingResult, RedirectAttributes redirectAttributes, boolean equalPasswords, boolean usernamePresent, boolean emailPresent) {
        redirectAttributes.addFlashAttribute("userRegisterDTO", userRegisterDTO);
        redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.userRegisterDTO", bindingResult);
        redirectAttributes.addFlashAttribute("bad_passwords", !equalPasswords);
        redirectAttributes.addFlashAttribute("usernamePresent", usernamePresent);
        redirectAttributes.addFlashAttribute("emailPresent", emailPresent);
    }

    @ModelAttribute
    public UserRegisterDTO userRegisterDTO() {
        return new UserRegisterDTO();
    }
}
