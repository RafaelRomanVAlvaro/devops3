# Use Amazon Corretto (Java 17) as the base image
FROM amazoncorretto:17

# Copy your built JAR file into the container
COPY ./target/devops.jar /tmp

# Set the working directory
WORKDIR /tmp

# Run the JAR, passing database host and delay arguments
ENTRYPOINT ["java", "-jar", "devops.jar", "db:3306", "30000"]

