FROM maven:latest
LABEL author="tonykarlin"

WORKDIR /app
COPY pom.xml /app/
COPY src /app/src
RUN mvn package -DskipTests
CMD ["java", "-jar", "target/OTP-1-1.0-SNAPSHOT.jar", "TemperatureConverter.Main"]