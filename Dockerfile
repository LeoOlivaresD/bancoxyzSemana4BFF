# Etapa 1: construcción
FROM maven:3.9.4-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Etapa 2: imagen final
FROM eclipse-temurin:17-jdk
WORKDIR /app

# Copiar el JAR generado
COPY --from=build /app/target/bancoxyz-0.0.1-SNAPSHOT.jar /app/ms-cuentas-anuales.jar

# Exponer el puerto del microservicio
EXPOSE 8081

# Configurar variable de entorno opcional (puede apuntar al config-server)
ENV CONFIG_SERVER_URL=http://config-server:8888

# Comando de inicio
ENTRYPOINT ["java", "-jar", "/app/ms-cuentas-anuales.jar"]
