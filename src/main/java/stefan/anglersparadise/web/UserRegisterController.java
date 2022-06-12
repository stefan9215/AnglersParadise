package stefan.anglersparadise.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import stefan.anglersparadise.model.dto.UserRegisterDTO;
import stefan.anglersparadise.service.UserRegisterService;

@Controller
@RequestMapping("/users")
public class UserRegisterController {

    private final UserRegisterService userRegisterService;

    public UserRegisterController(UserRegisterService userRegisterService) {
        this.userRegisterService = userRegisterService;
    }

    @GetMapping("/register")
    public String register(Model model) {
        return "register";
    }

    @PostMapping("/register")
    public String confirmRegister(UserRegisterDTO userRegisterDTO, BindingResult bindingResult,
                                  RedirectAttributes redirectAttributes) {

        if(bindingResult.hasErrors() &&
                userRegisterDTO.getPassword().equals(userRegisterDTO.getConfirmPassword())) {

            redirectAttributes.addFlashAttribute("bindingResult", bindingResult);

            return "redirect:/register";
        }

        userRegisterService.createAccount(userRegisterDTO);

        return "redirect:/";
    }
}
