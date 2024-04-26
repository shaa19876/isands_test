package ru.test.storage.repositories.productRepository;

import org.springframework.stereotype.Repository;
import ru.test.storage.entities.productEntity.Television;
import ru.test.storage.repositories.baseRepository.ProductRepository;

@Repository
public interface TelevisionRepository extends ProductRepository<Television> {
}
