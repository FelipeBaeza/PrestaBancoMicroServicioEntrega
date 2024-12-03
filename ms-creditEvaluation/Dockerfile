FROM openjdk:17
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} ms-creditEvaluation.jar
ENTRYPOINT ["java","-jar","/ms-creditEvaluation.jar"]