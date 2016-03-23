FROM anapsix/alpine-java
VOLUME /tmp
ADD @project.artifactId@-@project.version@.jar app.jar
RUN sh -c "touch /app.jar"
ENTRYPOINT ["java", "-jar", "/app.jar"]
