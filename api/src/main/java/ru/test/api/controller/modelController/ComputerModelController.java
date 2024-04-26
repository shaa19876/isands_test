package ru.test.api.controller.modelController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.test.api.controller.baseController.ModelController;
import ru.test.storage.entities.modelEntity.ComputerModel;
import ru.test.storage.repositories.modelRepository.ComputerModelRepository;

@RestController
@RequestMapping("/computer_model")
public class ComputerModelController extends ModelController<ComputerModel> {

    public ComputerModelController(ComputerModelRepository repository) {super(repository);}

}
