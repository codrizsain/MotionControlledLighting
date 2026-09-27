FROM openjdk:11-jdk-slim
WORKDIR /app
COPY LampLogger.java .
RUN javac LampLogger.java
CMD ["java", "LampLogger"]
