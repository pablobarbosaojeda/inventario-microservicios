FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/nodo2-0.0.1-SNAPSHOT.jar nodo2.jar

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "nodo2.jar"]
