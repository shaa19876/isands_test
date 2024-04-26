package ru.test.api.init;

import ru.test.storage.entities.productEntity.*;

import java.util.List;

public class ProductData {

    List<Television> televisions = List.of(
            Television.builder().name("tv1").manufacturerCountry("ru").manufacturerCompany("company1").onlineOrderAvailable(true).installmentAvailable(true).build(),
            Television.builder().name("tv2").manufacturerCountry("en").manufacturerCompany("company2").onlineOrderAvailable(true).installmentAvailable(true).build(),
            Television.builder().name("tv3").manufacturerCountry("us").manufacturerCompany("company3").onlineOrderAvailable(true).installmentAvailable(true).build()
    );

    List<VacuumCleaner> vacuumCleaners = List.of(
            VacuumCleaner.builder().name("vc1").manufacturerCountry("ru").manufacturerCompany("company1").onlineOrderAvailable(true).installmentAvailable(true).build(),
            VacuumCleaner.builder().name("vc2").manufacturerCountry("en").manufacturerCompany("company2").onlineOrderAvailable(true).installmentAvailable(true).build(),
            VacuumCleaner.builder().name("vc3").manufacturerCountry("us").manufacturerCompany("company3").onlineOrderAvailable(true).installmentAvailable(true).build()
    );

    List<Refrigerator> refrigerators = List.of(
            Refrigerator.builder().name("r1").manufacturerCountry("ru").manufacturerCompany("company1").onlineOrderAvailable(true).installmentAvailable(true).build(),
            Refrigerator.builder().name("r2").manufacturerCountry("en").manufacturerCompany("company2").onlineOrderAvailable(true).installmentAvailable(true).build(),
            Refrigerator.builder().name("r3").manufacturerCountry("us").manufacturerCompany("company3").onlineOrderAvailable(true).installmentAvailable(true).build()
    );

    List<Smartphone> smartphones = List.of(
            Smartphone.builder().name("s1").manufacturerCountry("ru").manufacturerCompany("company1").onlineOrderAvailable(true).installmentAvailable(true).build(),
            Smartphone.builder().name("s2").manufacturerCountry("en").manufacturerCompany("company2").onlineOrderAvailable(true).installmentAvailable(true).build(),
            Smartphone.builder().name("s3").manufacturerCountry("us").manufacturerCompany("company3").onlineOrderAvailable(true).installmentAvailable(true).build()
    );

    List<Computer> computers = List.of(
            Computer.builder().name("pc1").manufacturerCountry("ru").manufacturerCompany("company1").onlineOrderAvailable(true).installmentAvailable(true).build(),
            Computer.builder().name("pc2").manufacturerCountry("en").manufacturerCompany("company2").onlineOrderAvailable(true).installmentAvailable(true).build(),
            Computer.builder().name("pc3").manufacturerCountry("us").manufacturerCompany("company3").onlineOrderAvailable(true).installmentAvailable(true).build()
    );
}
