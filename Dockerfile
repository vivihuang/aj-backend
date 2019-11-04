
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
ADD build/libs/latvia*.jar latvia.jar
EXPOSE 8088
CMD ["java", "-jar", "latvia.jar"]
