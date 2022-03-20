# springboot-api-demo

This is a simple Spring Boot application that acts as an API gateway. It has only one endpoint.


## GET /post/{userId}

Calls the following endpoints at [http://jsonplaceholder.typicode.com](http://jsonplaceholder.typicode.com) API and combines their results into a single JSON output:
* http://jsonplaceholder.typicode.com/posts}
* http://jsonplaceholder.typicode.com/posts/{userId}


## How to run

* Clone project from github to any ide and need to have java 1.8  and run SpringBootRestApiApplication this class
* go to [http://localhost:303/post/1](http://localhost:8080/post/1) to see result for user with id 1


## Technologies used

* Spring Boot and Spring Web
* Retrofit
* Maven
