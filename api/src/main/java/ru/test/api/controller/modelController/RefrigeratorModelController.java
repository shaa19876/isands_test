package ru.test.api.controller.modelController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.test.api.controller.baseController.ModelController;
import ru.test.storage.entities.modelEntity.RefrigeratorModel;
import ru.test.storage.repositories.modelRepository.RefrigeratorModelRepository;

@RestController
@RequestMapping("/refrigerator_model")
public class RefrigeratorModelController extends ModelController<RefrigeratorModel> {

    public RefrigeratorModelController(RefrigeratorModelRepository repository) {super(repository);}

}
