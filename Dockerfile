FROM openjdk:8
EXPOSE 9090
ADD target/spring-boot-docker-maven.jar spring-boot-docker-maven.jar 
ENTRYPOINT ["java","-jar","/spring-boot-docker-maven.jar"]
