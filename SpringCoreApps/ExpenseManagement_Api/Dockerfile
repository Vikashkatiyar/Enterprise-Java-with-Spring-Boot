FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080


# FROM openjdk:17-alpine
# WORKDIR /opt
# ENV PORT 8080
# EXPOSE 8080
# COPY target/*.jar /opt/app.jar
# ENTRYPOINT exec java $JAVA_OPTS -jar app.jar


# docker run -d -p 8080:8080 --name your-app-container your-app-image
# docker-compose up


