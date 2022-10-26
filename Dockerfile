FROM openjdk:11-jdk

COPY ./docker /docker
WORKDIR /docker

CMD ["./gradlew", "bootRun"]