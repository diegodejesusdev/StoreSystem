FROM openjdk:21
EXPOSE 80
ADD src/dproject-market-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]