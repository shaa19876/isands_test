package ru.test.api.controller.modelController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.test.api.controller.baseController.ModelController;
import ru.test.storage.entities.modelEntity.SmartphoneModel;
import ru.test.storage.repositories.modelRepository.SmartphoneModelRepository;

@RestController
@RequestMapping("/smartphone_model")
public class SmartphoneModelController extends ModelController<SmartphoneModel> {

    public SmartphoneModelController(SmartphoneModelRepository repository) {super(repository);}

}
