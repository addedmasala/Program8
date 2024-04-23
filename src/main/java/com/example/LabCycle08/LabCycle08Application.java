package com.example.LabCycle08;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LabCycle08Application {

	public static void main(String[] args) {
		SpringApplication.run(LabCycle08Application.class, args);
	}

}












































































































install maven

create docker file 

FROM eclipse-temurin:17-jdk-alpine
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

in terminal 

docker build -t prog4:latest .

docker images

docker run -idtp 8080:8080 prog4 .
