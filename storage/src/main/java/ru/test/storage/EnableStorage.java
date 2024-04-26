package ru.test.storage;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("ru.test.storage.dao")
@EntityScan("ru.test.storage.entities")
@EnableJpaRepositories("ru.test.storage.repositories")
public class EnableStorage {
}
