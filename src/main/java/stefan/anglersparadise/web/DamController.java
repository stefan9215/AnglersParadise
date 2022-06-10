package stefan.anglersparadise.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dams")
public class DamController {

    @GetMapping("/all")
    public String allDams(Model model) {

        return "all-dams";
    }

    @GetMapping("/add")
    public String addDam() {
        return "add-dam";
    }
}
