# Usa una imagen base de OpenJDK
FROM openjdk:17-jdk-slim

# Establece el directorio de trabajo en el contenedor
WORKDIR /app

# Copia el archivo JAR del proyecto al contenedor
COPY target/nodo4-0.0.1-SNAPSHOT.jar nodo4.jar

# Expon el puerto 8084 para el Nodo 4
EXPOSE 8084

# Comando para ejecutar la aplicación Spring Boot
ENTRYPOINT ["java", "-jar", "nodo4.jar"]
