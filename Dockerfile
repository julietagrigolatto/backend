FROM amazoncorretto:11-alpine-jdk
MAINTAINER MariaJulietaGrigolatto
COPY target/MariaJulietaGrigolatto-0.0.1-SNAPSHOT.jar mjg-app.jar
ENTRYPOINT ["java","-jar","/mjg-app.jar"]