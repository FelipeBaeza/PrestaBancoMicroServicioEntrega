FROM openjdk:17
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} ms-clients1.jar
ENTRYPOINT ["java","-jar","/ms-clients1.jar"]