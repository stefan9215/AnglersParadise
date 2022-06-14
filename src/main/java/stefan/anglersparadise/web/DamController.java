package stefan.anglersparadise.web;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import stefan.anglersparadise.model.binding.AddDamBindingModel;
import stefan.anglersparadise.model.service.AddDamServiceModel;
import stefan.anglersparadise.model.view.DamViewModel;
import stefan.anglersparadise.service.DamService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/dams")
public class DamController {

    private final DamService damService;
    private final ModelMapper modelMapper;

    public DamController(DamService damService, ModelMapper modelMapper) {
        this.damService = damService;
        this.modelMapper = modelMapper;
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

    @PostMapping("/add")
    public String addDam(@Valid AddDamBindingModel addDamBindingModel, BindingResult bindingResult,
                         RedirectAttributes redirectAttributes) {

        if(bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("addDamBindingModel", addDamBindingModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.addDamBindingModel",bindingResult);

            return "redirect:addDam";
        }

        damService.addDam(modelMapper.map(addDamBindingModel, AddDamServiceModel.class));

        return "redirect:/details/" + addDamBindingModel.getId();
    }
}
