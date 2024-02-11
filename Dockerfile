FROM openjdk:17-alpine

EXPOSE 8080

ADD "target/parking-api-ms.jar" "parking-api-ms.jar"

ENTRYPOINT [ "java" , "-jar" , "parking-api-ms.jar" ]