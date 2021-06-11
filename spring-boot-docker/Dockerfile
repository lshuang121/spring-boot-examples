FROM maven:3.5-jdk-11 as Build
WORKDIR /usr/src/app
COPY pom.xml /usr/src/app
RUN mvn dependency:go-offline
COPY . /usr/src/app
RUN mvn package -DskipTests

FROM openjdk:11-jre
ARG VERSION
EXPOSE 8200 5005
COPY --from=Build /usr/src/app/target/spring-boot-docker-$VERSION.jar /opt/target/app.jar
WORKDIR /opt/target
RUN echo appVersion:$VERSION
CMD ["java", "-jar", "app.jar"]