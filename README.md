# java springboot APIs | JWT Security | H2 Database 


## Getting started

**Prerequisites**

1. JDK 1.8
2. Maven
    
**Run the application**

1. `cd` into project directory
2. Run command `mvn clean spring-boot:run`
3. Application will be started on `http://localhost:8080` on your browser


**Register users**

Before you access the API end points, First you need register a user by: 
   1. URL: http://localhost:8080/register
   2. HTTP method: POST
   3. Request body: {
                     "username" : "admin",
                     "password" : "admin"
                 }
                 
**Authenticate users & get JWT token**

After creating the user you need to authenticate it and get JWT token to access APIs
   1. URL: http://localhost:8080/authenticate
   2. HTTP method: POST
   3. Request body: {
                     "username" : "admin",
                     "password" : "admin"
                 }
   4. IN response to this request you will JWT token with 1 hour expiry
   
   
**API documentation**

Swagger UI included for API documentation, swagger can be access at: http://localhost:8080/swagger-ui.html

**Database**

H2 in mem database configured for this application, database can be accessed at :

 http://localhost:8080/h2-console
 
 JDBC URL: jdbc:h2:mem:string-manipulation
 
 User Name:	sa
