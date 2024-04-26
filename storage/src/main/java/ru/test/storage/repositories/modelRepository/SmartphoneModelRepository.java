package ru.test.storage.repositories.modelRepository;

import org.springframework.stereotype.Repository;
import ru.test.storage.entities.modelEntity.SmartphoneModel;
import ru.test.storage.repositories.baseRepository.ModelRepository;

@Repository
public interface SmartphoneModelRepository extends ModelRepository<SmartphoneModel> {
}
