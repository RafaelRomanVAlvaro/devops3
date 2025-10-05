FROM openjdk:latest
COPY ./target/seMethods3-0.1.0.2-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "seMethods3-0.1.0.2-jar-with-dependencies.jar"]