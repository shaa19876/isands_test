package ru.test.storage.repositories.baseRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import ru.test.storage.entities.baseEntity.Product;

import java.util.List;

@NoRepositoryBean
public interface ProductRepository<T extends Product> extends JpaRepository<T, Long> {

//    @Query(
//            nativeQuery = true,
//            value = "SELECT setval(:seqName, 1, false)"
//    )
//    void restartSeqId(String seqName);

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
}
