# Introduction
This project provides business-related services for Rasa.

# Spring Boot、Gradle、Docker
Spring Boot、Gradle、Docker、Detekt、Jacoco(plugin)


## Test
- check (run all tests & code scan)
```
./gradlew check
```

- check without api test
```
./gradlew -x apiTest check
```

- only do api test
```
./gradlew apiTest
```

## Build
- build locally
```
./gradlew build
```

## Run
- run locally
```
./gradlew bootRun
```

## Build Docker Image
- package spring boot
```
./gradlew bootJar
```

- build docker image
```
docker build -t aj/latvia .
```       
> set image version by `--build-arg IMAGE_VERSION=<image version>`

- run ocker image
```
docker run -p 8088:8080 aj/latvia
```
> set spring profile by `-e "SPRING_PROFILES_ACTIVE=<profile>"`

## Deploy (WIP)

# Monitor
- health check
    - `/hello?name=<default 'World'>`: sample response
    - `/profile`: print spring profile and image version
