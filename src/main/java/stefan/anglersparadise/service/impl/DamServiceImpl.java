package stefan.anglersparadise.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import stefan.anglersparadise.model.entity.DamEntity;
import stefan.anglersparadise.model.service.AddDamServiceModel;
import stefan.anglersparadise.model.view.DamViewModel;
import stefan.anglersparadise.repository.DamRepository;
import stefan.anglersparadise.service.DamService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DamServiceImpl implements DamService {

    private final DamRepository damRepository;
    private final ModelMapper modelMapper;

    public DamServiceImpl(DamRepository damRepository, ModelMapper modelMapper) {
        this.damRepository = damRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<DamViewModel> getAllDams() {
        return damRepository.findAll()
                .stream()
                .map(d -> modelMapper.map(d, DamViewModel.class))
                .collect(Collectors.toList());
    }

    @Override
    public void addDam(AddDamServiceModel addDamServiceModel) {
        DamEntity damEntity = modelMapper.map(addDamServiceModel, DamEntity.class);
        //TODO implement the functionality

    }
}
