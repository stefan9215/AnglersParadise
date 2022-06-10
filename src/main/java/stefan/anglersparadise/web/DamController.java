package stefan.anglersparadise.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import stefan.anglersparadise.model.view.DamViewModel;
import stefan.anglersparadise.service.DamService;

import java.util.List;

@Controller
@RequestMapping("/dams")
public class DamController {

    private final DamService damService;

    public DamController(DamService damService) {
        this.damService = damService;
    }

    @GetMapping("/all")
    public String allDams(Model model) {
        List<DamViewModel> allDams = damService.getAllDams();

        model.addAttribute("dams", allDams);
        return "all-dams";
    }

    @GetMapping("/add")
    public String addDam() {
        return "add-dam";
    }
}
