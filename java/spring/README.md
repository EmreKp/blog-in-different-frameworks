**Blog demo written in Spring Framework**

This blog is written using Spring Boot and Java 8. The goal is to understand how a MVC app made in a framework. 

When you first run the project, you should uncomment

```spring.jpa.hibernate.ddl-auto=create```

on **application.properties** file to create tables automatically for you and when you run next time, you should comment it again to disable the database from deleting.

You need to create a database named "blogbase" with MySQL. After that, when you run the app, it will create necessary tables itself.

You can run the app with an IDE like IntelliJ IDEA, or if you wish to run it by command line, the necessary command lines are:

```mvn install && java -jar target/spring-0.0.1-SNAPSHOT.jar```

Congrats! The blog app is running!
 