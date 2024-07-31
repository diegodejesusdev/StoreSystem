FROM openjdk:21
EXPOSE 80
ADD dproject-market-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]