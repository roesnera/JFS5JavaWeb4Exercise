
# WEB-JAVA-4 - REST API with Spring Boot


 <br/>
 <br/>


## Part 1: Project Set-up
1. Download the project and import it as a Maven project into your IDE.
2. Verify the connection properties in the *application.properties* file.
   a. You will need to verify that you have a database called sys on your local MySQL or change the url
   b. You will need to add a new user to your MySQL server using the workbench
   c. Make sure this user has DBA permissions
   d. Update the user info in application.properties
3. Run the application and verify that the sample data is created from the Web Application.

## Part 2: Implementing a REST API CRUD
1. Create a new package in the studentsapplication package called *controller*.
2. Create a new class called *StudentsController*.
3. Annotate the *StudentsController* with the *@RestController*.
4. Inject the *StudentService* into the *StudentsController* via the constructor:
    ```java
    private StudentService studentService;

    public StudentsController( StudentService studentService )
    {
        StudentsApplication.studentService = studentService;
    }
    ``` 
5. Define an endpoint for each of the CRUD methods as follows:

   | Method Name                          | HTTP Method | Endpoint Path |
      |--------------------------------------|-------------|---------------|
   | all()                                | GET         | /student      |
   | findById(@PathVariable String id)    | GET         | /student/{id} |
   | save(@RequestBody Student student)   | POST        | /student      |
   | update(@RequestBody Student student) | PUT         | /student      |
   | delete(@PathVariable String id)      | DELETE      | /student/{id} |

6. Use Postman to test your REST API. Verify each of the CRUD operations:
* Create a new Student
* Find a Student by ID
* Get All the Students List
* Update a Student
* Delete a Student

## Challenge Yourself
1. Create an additional endpoint that lets you update a student record with just one of the column values and the id using request parameters (could combine with path variables).