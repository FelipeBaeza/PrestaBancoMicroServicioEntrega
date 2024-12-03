FROM openjdk:17
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} ms-totalCosts.jar
ENTRYPOINT ["java","-jar","/ms-totalCosts.jar"]
