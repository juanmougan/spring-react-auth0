Resources
https://spring.io/guides/tutorials/react-and-spring-data-rest/

https://kotlinlang.org/docs/tutorials/spring-boot-restful.html


1. Same steps in http://start.spring.io/ but using Kotlin and Gradle, instead of Java and Maven

2. Build the empty project, to fetch the dependencies

    $ ./gradlew clean
    $ ./gradlew build

Or run directly

    $ ./gradlew bootRun

3. Curl to fetch data

    $ curl localhost:8080/api
