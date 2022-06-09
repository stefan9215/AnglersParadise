package stefan.anglersparadise.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DamController {

    @GetMapping("/dams/all")
    public String allDams(Model model) {

        return "all-dams";
    }

    @GetMapping("/dams/add")
    public String addDam() {
        return "add-dam";
    }
}
