FROM openjdk:11
RUN mkdir /app
WORKDIR /app
ADD ./v1/api/target/api-1.0-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "api-1.0-SNAPSHOT.jar"]
