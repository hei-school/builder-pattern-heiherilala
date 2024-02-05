[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/eYTuOlgZ)

# DESIGN PATTERN - BUILDER

This project focuses on implementing a car and its manual using the Builder design pattern with a director.7

## To use application

- To run the application:

```shell
    ./gradlew bootRun
```

- To clean previous builds:

```shell
    ./gradlew clean
```

- To build:

```shell
    ./gradlew assemble
```

- To run tests:

```shell
    ./gradlew test checkstyleMain checkstyleTest
```

## Requirements

### JDK installation

Ensure that you have the Java Development Kit (JDK) 17 installed. You can  [download and install](https://docs.oracle.com/en/java/javase/17/install/overview-jdk-installation.html)  based on your operating system.

## Linter and Coding standard

The project adheres to the Google Java Style Guide.

The linter utilized is Checkstyle, configured with Gradle.

Formatting is managed by Google-java-format, executed using the script format.sh:

```shell
    ./format.sh
```