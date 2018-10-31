# fullstack-app-demo
[![Build Status](https://www.travis-ci.org/trelo-bifteki/fullstack-app-demo.svg?branch=master)](https://www.travis-ci.org/trelo-bifteki/fullstack-app-demo)

A project setup for having both frontend and backend submodules

## About

This is a template / example of a Gradle project setup that can be used for both frontend
and backend teams in the same repository. Frontend development is allowed to use its
own building procedures (npm, NodeJS, Webpack, etc). Frontend projects are going to be
transformed into webjars and imported as dependencies properly into the backend
submodules.

## Features

- Allow independent development for frontend / backend developers
- Using VueJs2 and vue-cli for frontend development
- Using spring-boot for backend development
- Clean gradle project setup (no copying files from one project to another)
- Clear dependency tree / project structure

## Build

### Prerequisites

- Java

### Installation

```
gradlew build
```
