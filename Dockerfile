#FROM openjdk:17-jdk-alpine
#WORKDIR /app
#ARG JAR_FILE=target/*.jar
#COPY ./target/Gainzone-0.0.1-SNAPSHOT.jar app.jar
#ENTRYPOINT ["java", "-jar", "/app.jar"]
#EXPOSE 8080


# Build stage
#FROM maven:3.8.6-openjdk-17 AS build
#WORKDIR /app
#COPY . .
#RUN mvn clean package -DskipTests

# Package stage
#FROM openjdk:17-jdk-slim
#WORKDIR /app
#COPY --from=build /app/target/*.jar app.jar
#EXPOSE 8080
#ENTRYPOINT ["java", "-jar", "app.jar"]


# Stage 1: Build the JAR
FROM maven:3.9.6-eclipse-temurin-17-alpine AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Copy the built JAR into a smaller runtime image
FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/Gainzone-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
