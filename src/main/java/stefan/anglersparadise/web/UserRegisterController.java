package stefan.anglersparadise.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserRegisterController {

    @GetMapping("/users/register")
    public String register(Model model) {
        return "register";
    }
}
