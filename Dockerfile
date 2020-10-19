FROM openjdk:8-jre-alpine

MAINTAINER Riviewz "contact@riviewz.com"

WORKDIR /usr/local/bin/

COPY ./target/entities-ms-0.0.1-SNAPSHOT.jar entities-ms.jar

CMD ["java", "-jar", "entities-ms.jar"]