package ru.test.storage.repositories.baseRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import ru.test.storage.entities.baseEntity.Model;

import java.util.List;

@NoRepositoryBean
public interface ModelRepository<T extends Model> extends JpaRepository<T, Long> {

    @Query(nativeQuery = true,
            value = """
                    SELECT * FROM #{#entityName} e
                    ORDER BY e.name ASC
                    """)
    List<T> findByOrderByNameAsc();

    @Query(nativeQuery = true,
            value = """
                    SELECT * FROM #{#entityName} e
                    ORDER BY e.name DESC
                    """)
    List<T> findByOrderByNameDesc();

    @Query(nativeQuery = true,
            value = """
                    SELECT * FROM #{#entityName} e
                    ORDER BY e.price ASC
                    """)
    List<T> findByOrderByPriceAsc();

    @Query(nativeQuery = true,
            value = """
                    SELECT * FROM #{#entityName} e
                    ORDER BY e.price DESC
                    """)
    List<T> findByOrderByPriceDesc();

    @Query(nativeQuery = true,
            value = """
                    SELECT * FROM #{#entityName} e WHERE
                    (:color is null OR e.color = :color)
                    AND (:min is null OR e.price >= :min)
                    AND (:max is null OR e.price <= :max)
                    ORDER BY CASE
                        WHEN :sort = 'name' THEN CONCAT (e.name)
                        WHEN :sort = 'price' THEN CONCAT (e.price)
                        ELSE CONCAT (e.name)
                    END
                    """)
    List<T> findAllWithParam(
            @Param("color") String color,
            @Param("min") Double minPrice,
            @Param("max") Double maxPrice,
            @Param("sort") String sortBy
    );

}
