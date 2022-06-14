package stefan.anglersparadise.service;

import stefan.anglersparadise.model.service.AddDamServiceModel;
import stefan.anglersparadise.model.view.DamViewModel;

import java.util.List;

public interface DamService {
    List<DamViewModel> getAllDams();

    void addDam(AddDamServiceModel addDamServiceModel);
}
