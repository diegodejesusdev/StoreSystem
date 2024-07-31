FROM openjdk:21
#VOLUME /tmp
EXPOSE 80
ADD ./build/libs/dproject-market-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]