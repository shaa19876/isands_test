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
import ru.test.storage.entities.productEntity.Smartphone;

@Setter
@Getter
@NoArgsConstructor
@SuperBuilder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name = "smartphone_model")
public class SmartphoneModel extends Model {

    double memory;
    int countCameras;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "smartphone_id")
    @JsonBackReference
    Smartphone smartphone;
}
