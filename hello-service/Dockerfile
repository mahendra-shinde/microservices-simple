FROM openjdk:8-jdk
WORKDIR /app

COPY target/*jar /app/hello-service-1.0.jar

ENTRYPOINT [ "java","-jar","/app/hello-service-1.0.jar" ]