# Build stage
#FROM eclipse-temurin:22-jdk-alpine AS build
#
#WORKDIR /app
#
#COPY pom.xml .
#COPY src ./src
#
#RUN apk add --no-cache maven
#
#RUN mvn clean package -DskipTests
#
## Runtime image
#FROM eclipse-temurin:22-jre-alpine
#WORKDIR /app
#
#COPY --from=build /app/target/*.jar app.jar
#
#EXPOSE 8080
#ENTRYPOINT ["java", "-jar", "app.jar"]

FROM eclipse-temurin:22-jdk-alpine AS build

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN apk add --no-cache maven

RUN mvn clean package -DskipTests

# Runtime image
FROM eclipse-temurin:22-jre-alpine
WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]


#FROM maven:3.9.4-eclipse-temurin-17
#
#WORKDIR /app
#
#COPY pom.xml .
#COPY src ./src
#
#CMD ["mvn", "spring-boot:run"]


