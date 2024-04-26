package ru.test.storage.entities.productEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.SQLRestriction;
import ru.test.storage.entities.baseEntity.Product;
import ru.test.storage.entities.modelEntity.VacuumCleanerModel;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@SuperBuilder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name = "vacuum_cleaner")
public class VacuumCleaner extends Product {

    @OneToMany(mappedBy = "vacuumCleaner")
    @SQLRestriction(value = "available = true")
    List<VacuumCleanerModel> availableModels;

}
