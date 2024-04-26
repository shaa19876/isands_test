package ru.test.api.controller.productController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.test.api.controller.baseController.ProductController;
import ru.test.storage.entities.productEntity.Refrigerator;
import ru.test.storage.repositories.productRepository.RefrigeratorRepository;

@RestController
@RequestMapping("/refrigerator")
public class RefrigeratorController extends ProductController<Refrigerator> {

    public RefrigeratorController(RefrigeratorRepository repository) {
        super(repository);
    }

}
