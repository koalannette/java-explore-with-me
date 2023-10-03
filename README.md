# java-explore-with-me
PR link: https://github.com/koalannette/java-explore-with-me/pull/5

Приложение предоставляет сервис для планирования интересных событий (афиша) и поиска компании для участия в них.

Приложение состоит из четырех микросервисов - основной сервис, основная БД, сервис статистики просмотров, БД для статистики. Каждый микросервис поднимается в отдельном docker-контейнере.

# API основного сервиса разделена на три части:
- **публичная** доступна без регистрации любому пользователю сети;
- **закрытая** доступна только авторизованным пользователям;
- **административная** — для администраторов сервиса.

# Технологический стек
Java 11, Maven, Spring-Boot, Hibernate, Postgresql, Lombok, MapStruct, Docker.

# Схема базы данных основного сервиса
![drawSQL-explore-with-me-export-2023-10-03](https://github.com/koalannette/java-explore-with-me/assets/113180456/1bc06a2b-27c4-4699-98dc-57efe2ca1745)
