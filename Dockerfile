FROM openjdk:17
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} testrestapi.jar
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar /testrestapi.jar"]