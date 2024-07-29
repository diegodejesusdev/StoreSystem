# Etapa de construcción
FROM gradle:8.8-jdk21 AS build

WORKDIR /app
COPY . /app
RUN gradle clean build

# Etapa de ejecución
FROM openjdk:21-jre-slim-buster

WORKDIR /app
COPY --from=build /app/build/libs/dproject-market-1.0-SNAPSHOT.jar /app/dproject-market-1.0-SNAPSHOT.jar

EXPOSE 8090

LABEL authors="dproject"

ENTRYPOINT ["java", "-XX:+UnlockDiagnosticVMOptions", "-XX:+PrintFlagsFinal", "-jar", "/app/dproject-market.jar"]
