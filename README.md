### REST-приложение с Open API v3 документацией в виде страницы swagge
Приложение состоит из двух микросервисов (Api, Storage), в случае пустой БД, при запуске приложение автоматически инициализирует таблицы тестовыми значениями.

## Стэк
- JDK 8
- SpringBoot 3.2.5
- SpringDoc 2.5.0
- Maven 4.0.0

## Инструкция по запуску
1. в API-модуле изменить аутенфикационные данные для подлкючения к PostgreSQL application.yml
2. Запустить API-модуль из класса Application.java
3. По адресу http://localhost:8080/swagger-ui/index.html выолнить тестовые запросы к серверу
