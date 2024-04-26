package ru.test.api.init;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.test.storage.entities.baseEntity.Model;
import ru.test.storage.entities.modelEntity.*;
import ru.test.storage.repositories.baseRepository.ModelRepository;
import ru.test.storage.repositories.modelRepository.*;

import java.util.ArrayList;
import java.util.List;

@Log4j2
@RequiredArgsConstructor
@Component
public class InitData implements CommandLineRunner {

    @Autowired
    TelevisionModelRepository televisionRepo;
    @Autowired
    VacuumCleanerModelRepository vacuumCleanerRepo;
    @Autowired
    RefrigeratorModelRepository refrigeratorRepo;
    @Autowired
    SmartphoneModelRepository smartphoneRepo;
    @Autowired
    ComputerModelRepository computerRepo;

    List<TelevisionModel> televisionModels = new ArrayList<>();
    List<VacuumCleanerModel> vacuumCleanerModels = new ArrayList<>();
    List<RefrigeratorModel> refrigeratorModels = new ArrayList<>();
    List<SmartphoneModel> smartphoneModels = new ArrayList<>();
    List<ComputerModel> computerModels = new ArrayList<>();

    @Override
    public void run(String... args) throws Exception {

        initProducts();
        saveProducts(televisionRepo, televisionModels);
        saveProducts(vacuumCleanerRepo, vacuumCleanerModels);
        saveProducts(refrigeratorRepo, refrigeratorModels);
        saveProducts(smartphoneRepo, smartphoneModels);
        saveProducts(computerRepo, computerModels);
    }

    private <T extends Model> void saveProducts(ModelRepository<T> dao, List<T> products) {
        if (!dao.findAll().isEmpty()) return;
        dao.saveAll(products);

        log.debug(String.format("Init data insert into tables from %s", products.get(0).getClass()));
    }

    private void initProducts() {

        ProductData productData = new ProductData();

        productData.televisions.forEach(television -> {
            televisionModels.add(
                    TelevisionModel.builder()
                            .name("name_model_1")
                            .serialNumber("111")
                            .color("red")
                            .size(1)
                            .category("test")
                            .technology("test")
                            .price(100)
                            .available(true)
                            .television(television)
                            .build()
            );
            televisionModels.add(
                    TelevisionModel.builder()
                            .name("name_model_2")
                            .serialNumber("222")
                            .color("green")
                            .size(2)
                            .category("test")
                            .technology("test")
                            .price(200)
                            .available(false)
                            .television(television)
                            .build()
            );
        });

        productData.vacuumCleaners.forEach(vacuumCleaner -> {
            vacuumCleanerModels.add(
                    VacuumCleanerModel.builder()
                            .name("name_model_1")
                            .serialNumber("123")
                            .color("red").size(1)
                            .volumeDustCollector(5)
                            .countMode(3)
                            .price(200)
                            .available(false)
                            .vacuumCleaner(vacuumCleaner)
                            .build()
            );
            vacuumCleanerModels.add(
                    VacuumCleanerModel.builder()
                            .name("name_model_2")
                            .serialNumber("123")
                            .color("green")
                            .size(1)
                            .volumeDustCollector(5)
                            .countMode(3)
                            .price(300)
                            .available(true)
                            .vacuumCleaner(vacuumCleaner)
                            .build());
        });

        productData.refrigerators.forEach(refrigerator -> {
            refrigeratorModels.add(
                    RefrigeratorModel.builder()
                            .name("name_model_1")
                            .serialNumber("123")
                            .color("red")
                            .size(1)
                            .countDoors(2)
                            .typeCompressor("test")
                            .price(400)
                            .available(false)
                            .refrigerator(refrigerator)
                            .build());
            refrigeratorModels.add(
                    RefrigeratorModel.builder()
                            .name("name_model_2")
                            .serialNumber("123")
                            .color("green")
                            .size(1)
                            .countDoors(2)
                            .typeCompressor("test")
                            .price(500)
                            .available(true)
                            .refrigerator(refrigerator)
                            .build());
        });

        productData.smartphones.forEach(smartphone -> {
            smartphoneModels.add(
                    SmartphoneModel.builder()
                            .name("name_model_1")
                            .serialNumber("123")
                            .color("red")
                            .size(1)
                            .memory(128)
                            .countCameras(2)
                            .price(300)
                            .available(false)
                            .smartphone(smartphone)
                            .build()
            );
            smartphoneModels.add(
                    SmartphoneModel.builder()
                            .name("name_model_2")
                            .serialNumber("123")
                            .color("green")
                            .size(1)
                            .memory(128)
                            .countCameras(2)
                            .price(400)
                            .available(true)
                            .smartphone(smartphone)
                            .build()
            );
        });

        productData.computers.forEach(computer -> {
            computerModels.add(
                    ComputerModel.builder()
                            .name("name_model_1")
                            .serialNumber("123")
                            .color("red")
                            .size(1)
                            .category("test")
                            .processor("test")
                            .price(500)
                            .available(true)
                            .computer(computer)
                            .build()
            );
            computerModels.add(
                    ComputerModel.builder()
                            .name("name_model_2")
                            .serialNumber("123")
                            .color("green")
                            .size(1)
                            .category("test")
                            .processor("test")
                            .price(600)
                            .available(false)
                            .computer(computer)
                            .build()
            );
        });
    }
}
