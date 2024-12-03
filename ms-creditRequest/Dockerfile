FROM openjdk:17
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} ms-creditRequest.jar
ENTRYPOINT ["java","-jar","/ms-creditRequest.jar"]