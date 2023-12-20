FROM eclipse-temurin:17-jre
EXPOSE 8080
COPY start.sh .
RUN chmod +x start.sh
COPY ./target/sample.jar sample.jar
