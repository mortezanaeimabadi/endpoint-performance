**Endpoint Perfomance Checker with Actuator**
# Technology Stack

- [Java](https://www.java.com) ( version 1.8 )
- [Spring Boot](https://spring.io/projects/spring-boot) ( version 2.4.4 )

## Requirements 
Apache Maven (version: 3.6.3)<br/>
Download Apache Maven and Java 8.

## Build
To build the project, run

```shell script
git clone https://github.com/mortezanaeimabadi/endpoint-performance.git
cd endpoint-performance
mvn clean package
```

## Deploy locally and RUN
To run navigate to /target directory and run:
```shell script 
java -jar endpoint-performance.jar
```

View rest endpoint metrics:
http://localhost:8811/actuator/metrics/http.server.requests
