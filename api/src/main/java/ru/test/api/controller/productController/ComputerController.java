package ru.test.api.controller.productController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.test.api.controller.baseController.ProductController;
import ru.test.storage.entities.productEntity.Computer;
import ru.test.storage.repositories.productRepository.ComputerRepository;

@RestController
@RequestMapping("/computer")
public class ComputerController extends ProductController<Computer> {

    public ComputerController(ComputerRepository repository) {
        super(repository);
    }

}
