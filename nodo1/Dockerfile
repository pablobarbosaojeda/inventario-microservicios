FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/nodo1-0.0.1-SNAPSHOT.jar nodo1.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "nodo1.jar"]
