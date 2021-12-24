From openjdk:latest

copy ./target /

CMD ["java", "-jar", ".ahmdoosh-1.0-SNAPSHOT.jar"]
