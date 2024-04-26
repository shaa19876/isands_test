package ru.test.storage.entities.modelEntity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import ru.test.storage.entities.baseEntity.Model;
import ru.test.storage.entities.productEntity.VacuumCleaner;

@Setter
@Getter
@NoArgsConstructor
@SuperBuilder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name = "vacuum_cleaner_model")
public class VacuumCleanerModel extends Model {

    double volumeDustCollector;
    int countMode;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "vacuum_cleaner_id")
    @JsonBackReference
    VacuumCleaner vacuumCleaner;
}
