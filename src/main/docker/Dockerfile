FROM anapsix/alpine-java
VOLUME /tmp
ADD /Users/Patrick/IdeaProjects/spring-boot-webpack/target/springbootwebpack-1.2.2.jar app.jar
RUN sh -c "touch /app.jar"
ENTRYPOINT ["java", "-jar", "/app.jar"]
