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
import ru.test.storage.entities.productEntity.Refrigerator;

@Setter
@Getter
@NoArgsConstructor
@SuperBuilder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name = "refrigerator_model")
public class RefrigeratorModel extends Model {

    int countDoors;
    String typeCompressor;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "refrigerator_id")
    @JsonBackReference
    Refrigerator refrigerator;
}
