# Location service demo

## Description

This is a demo that serves no real purpose

API documentation available at http://docs.locationdemo.apiary.io/#reference

## Installation

- clone repository:
```sh
git clone https://github.com/WarewolfCZ/LocationDemo.git
```
- build jar:
```sh
mvn package
```

- create file application.properties and place it next to jar file

example configuration for H2 database:

```properties
spring.datasource.url = jdbc:h2:file:./LocationService;FILE_LOCK=FS
spring.datasource.driverClassName=org.h2.Driver
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

server.port = 8081

logging.level.root=INFO
logging.level.org.springframework.web=INFO
logging.level.org.hibernate=ERROR
logging.level.cz.mediawork.mystay.proxy=INFO
logging.file=location-servicess.log
```
example configuration for MySQL database (also a default configuration if no application.properties file present):

```properties
spring.datasource.url=jdbc:mysql://localhost/location?characterEncoding=UTF-8&useSSL=false
spring.datasource.username=location
spring.datasource.password=location
spring.datasource.driverClassName=com.mysql.jdbc.Driver
spring.datasource.transaction-isolation=true
spring.datasource.testOnBorrow=true
spring.datasource.validationQuery=SELECT 1
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect

server.port = 8081

logging.level.root=INFO
logging.level.org.springframework.web=INFO
logging.level.org.hibernate=ERROR
logging.level.cz.mediawork.mystay.proxy=INFO
logging.file=location-service.log
```

- run the service
```sh
java -jar location.jar
```
