# Introduction
This project provides business-related services for Rasa.

# Spring Boot、Gradle、Docker
Spring Boot、Gradle、Docker、Detekt、Jacoco(plugin)

# Build with Docker
1. build:
    ```shell script
    gradle build
    ```
1. build Docker image:
    ```shell script
    docker build -t aj/latvia .
    ```       
1. run Docker image:
    ```shell script
    docker run -p 8088:8088 -t aj/latvia
    ```
