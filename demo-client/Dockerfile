FROM openjdk:8-jdk
WORKDIR /app

COPY target/*.jar /app/demo-client-1.0.jar

ENTRYPOINT [ "java","-jar","/app/demo-client-1.0.jar" ]