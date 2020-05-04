FROM openjdk:8-jdk

WORKDIR /app

COPY target/*.jar /app/eureka-server.jar

ENTRYPOINT [ "java","-jar","/app/eureka-server.jar" ]
