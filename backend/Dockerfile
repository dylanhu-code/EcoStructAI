FROM openjdk:21-jdk-slim
WORKDIR /app
COPY target/backend-1.0-SNAPSHOT.jar ecostructai-backend.jar
EXPOSE 8080
CMD ["java", "-jar", "ecostructai-backend.jar"]
