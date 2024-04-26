package ru.test.api.controller.modelController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.test.api.controller.baseController.ModelController;
import ru.test.storage.entities.modelEntity.TelevisionModel;
import ru.test.storage.repositories.modelRepository.TelevisionModelRepository;

@RestController
@RequestMapping("/television_model")
public class TelevisionModelController extends ModelController<TelevisionModel> {

    public TelevisionModelController(TelevisionModelRepository repository) {super(repository);}

}
