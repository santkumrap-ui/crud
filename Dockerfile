# Use official JDK 23 image (matches your compiled jar)
FROM eclipse-temurin:23-jdk-alpine

# Set working directory inside container
WORKDIR /app

# Copy the Spring Boot jar into container
COPY target/deploy-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the jar
ENTRYPOINT ["java","-jar","app.jar"]