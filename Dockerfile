FROM openjdk:latest
COPY ./target/seMethods3-1.0-SNAPSHOT-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "seMethods3-1.0-SNAPSHOT-jar-with-dependencies.ja"]