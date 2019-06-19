## Hello Service
1. Visit https://start.spring.io

    ```
    Choose "Maven Project" ,
    Choose "Java" Language 
    and Spring Boot 2.1.6

    Group: com.mahendra
    artifact: hello-service

    Dependencies: Spring Web Starter, Eureka Discovery Client
    ```
2. Click "Generate Project" button to download and save "hello-service.zip"

3.  Goto Downloads folder and extract "hello-service.zip" use "extract here..."

4.  Goto eclipse with workspace C:\microservices-ws (Or use already open eclipse!)

5.  File -> Import -> Maven : Existing Maven project"
        Choose folder Downloads\hello-service

6.  Goto HelloServiceApplication.java and add annotation:

    ```java
        @EnableDiscoveryClient
    ```

    Save changes, Run As Java Application

7.  Open "application.properties" and add few properties:

    ```
    spring.application.name=hello
    server.port=3001
    ```

8.  Run "Eureka-Server" (If not already running)

    Visit http://localhost:8761