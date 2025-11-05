FROM eclipse-temurin:17-jdk-jammy
COPY ./target/seMethods3-0.1.0.4-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "seMethods3-0.1.0.4-jar-with-dependencies.jar"]