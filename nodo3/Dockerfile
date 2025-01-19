# Usa una imagen base de OpenJDK
FROM openjdk:17-jdk-slim

# Establece el directorio de trabajo en el contenedor
WORKDIR /app

# Copia el archivo JAR del proyecto al contenedor
COPY target/nodo3-0.0.1-SNAPSHOT.jar nodo3.jar

# Expon el puerto 8083 para el Nodo 3
EXPOSE 8083

# Comando para ejecutar la aplicación Spring Boot
ENTRYPOINT ["java", "-jar", "nodo3.jar"]
