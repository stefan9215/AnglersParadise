package stefan.anglersparadise.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import stefan.anglersparadise.model.entity.UserEntity;
import stefan.anglersparadise.model.test.UserLoginModel;
import stefan.anglersparadise.repository.UserRepository;

import java.util.Optional;

@Controller
public class UserLoginController {


    @GetMapping("/users/login")
    public String login(Model model) {
        return "login";
    }

}
