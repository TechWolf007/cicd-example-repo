FROM eclipse-temurin:21-jre
EXPOSE 8080
ADD target/cicdexample-0.0.1-SNAPSHOT.jar cicdexample.jar
ENTRYPOINT ["java","-jar","/cicdexample.jar"]