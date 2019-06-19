## Create Eureka Server
1. Visit "https://start.spring.io"
    ```
    Choose Maven Project, 
    Java Language, 
    Spring Boot 2.1.6

    Group :  com.mahendra
    Artifact: eureka-Server
    Dependencies: Eureka-Server
    ```

2.  Click on "Generate Project" button > Save the file (ZIP)
3.  Launch eclipse (photon or oxygen)
    Workspace : c:\microservices-ws

4.  Goto "Downloads" folder and extract the contents of "demo.zip" 
    into "demo" folder

5.  Window Menu > Preferences > Search "maven" > Uncheck "Download Artifact Sources"
    
    WHY: Reduces TIME required for maven to download JAR files.

6.  From inside eclipse, File > Import > Maven : Existing Maven Project 
    
    Goto Folder Downloads\demo
        Select Folder

7.  Once project is successfuly imported, got "src\main\resources" 
    Open "application.properties" file
    ```
    # avoid registering with SELF
    eureka.client.register-with-eureka=false
    eureka.client.fetch-registry=false
    server.port=8761
    ```

8.  Goto "DemoApplication.java" file 
    Add one Annotation on class level

        @EnableEurekaServer
    
    Save the changes, Run As Java Application

    Open web browser and visit:
        http://localhost:8761