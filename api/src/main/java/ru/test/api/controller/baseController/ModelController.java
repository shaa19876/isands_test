package ru.test.api.controller.baseController;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.test.storage.entities.baseEntity.Model;
import ru.test.storage.repositories.baseRepository.ModelRepository;

import java.util.List;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PROTECTED, makeFinal = true)
public abstract class ModelController<T extends Model> {

    ModelRepository<T> repository;

    @GetMapping
    public List<T> getAll(
            @RequestParam(required = false) String color,
            @RequestParam(required = false) Double minPrice,
            @RequestParam(required = false) Double maxPrice,
            @RequestParam(required = false) String sortBy
    ) {
        return repository.findAllWithParam(color, minPrice, maxPrice, sortBy);
    }

    @GetMapping("/{id}")
    public T getById(@PathVariable("id") Long id) {
        return repository.findById(id)
                .orElse(null);
    }

    @PostMapping
    public T create(@RequestBody T entity) {
        return repository.save(entity);
    }

    @PatchMapping("/{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody T source) {
        return repository.findById(id)
                .map(target -> {
                    BeanUtils.copyProperties(source, target, "id");
                    return target;
                })
                .map(repository::save)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id") Long id) {
        return repository.findById(id)
                .map(entity -> {
                    repository.delete(entity);
                    return entity;
                })
                .map(t -> ResponseEntity.noContent().build())
                .orElse(ResponseEntity.notFound().build());
    }

}
