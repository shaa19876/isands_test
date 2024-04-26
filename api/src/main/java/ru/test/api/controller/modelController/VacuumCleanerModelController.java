package ru.test.api.controller.modelController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.test.api.controller.baseController.ModelController;
import ru.test.storage.entities.modelEntity.VacuumCleanerModel;
import ru.test.storage.repositories.modelRepository.VacuumCleanerModelRepository;

@RestController
@RequestMapping("/vacuum_cleaner_model")
public class VacuumCleanerModelController extends ModelController<VacuumCleanerModel> {

    public VacuumCleanerModelController(VacuumCleanerModelRepository repository) {super(repository);}

}
