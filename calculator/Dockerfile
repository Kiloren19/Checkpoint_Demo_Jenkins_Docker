FROM openjdk:17-alpine
EXPOSE 8081
ADD target/demo-jenkins.jar demo-jenkins.jar 
ENTRYPOINT ["java", "-jar", "demo-jenkins.jar"]