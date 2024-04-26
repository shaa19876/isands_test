package ru.test.api.controller.productController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.test.api.controller.baseController.ProductController;
import ru.test.storage.entities.productEntity.Smartphone;
import ru.test.storage.repositories.productRepository.SmartphoneRepository;

@RestController
@RequestMapping("/smartphone")
public class SmartphoneController extends ProductController<Smartphone> {

    public SmartphoneController(SmartphoneRepository repository) {
        super(repository);
    }

}
