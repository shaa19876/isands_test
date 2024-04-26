package ru.test.api.controller.productController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.test.api.controller.baseController.ProductController;
import ru.test.storage.entities.productEntity.Television;
import ru.test.storage.repositories.productRepository.TelevisionRepository;

@RestController
@RequestMapping("/television")
public class TelevisionController extends ProductController<Television> {

    public TelevisionController(TelevisionRepository repository) {
        super(repository);
    }

}
