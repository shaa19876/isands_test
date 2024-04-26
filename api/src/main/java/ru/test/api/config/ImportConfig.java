package ru.test.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ru.test.storage.EnableStorage;

@Import({
        EnableStorage.class
})
@Configuration
public class ImportConfig {
}
