package ru.test.api.controller.productController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.test.api.controller.baseController.ProductController;
import ru.test.storage.entities.productEntity.VacuumCleaner;
import ru.test.storage.repositories.productRepository.VacuumCleanerRepository;

@RestController
@RequestMapping("/vacuum_cleaner")
public class VacuumCleanerController extends ProductController<VacuumCleaner> {

    public VacuumCleanerController(VacuumCleanerRepository repository) {
        super(repository);
    }

}
