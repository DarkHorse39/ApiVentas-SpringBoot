# API REST - Sistema de Ventas (Spring Boot)

Esta es la API REST del Sistema de Ventas. Se encarga de recibir las peticiones HTTP (POST) desde la aplicación Android, validar los datos y registrar la Orden de Venta en una base de datos SQL Server.

## Tecnologías utilizadas
* Java 25
* Spring Boot 4.1.2
* Spring Data JPA / Hibernate
* SQL Server
* Maven

## Cómo ejecutar
1. Clona este repositorio.
2. Crea una base de datos en SQL Server y actualiza las credenciales en el archivo `src/main/resources/application.properties`.
3. Compila el proyecto usando Maven: `mvnw clean install`.
4. Ejecuta la aplicación ejecutando el archivo `.jar` generado o la clase principal desde tu IDE.
5. El endpoint principal para registrar ventas es: `POST http://localhost:8080/api/facturas`.
