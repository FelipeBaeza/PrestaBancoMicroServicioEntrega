FROM openjdk:17
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} ms-clients.jar
ENTRYPOINT ["java","-jar","/ms-clients.jar"]