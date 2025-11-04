Student Management System
Description -
The Student Management System is a backend web application built using Spring Boot, Java, and MySQL.It provides a set of REST API endpoints for performing CRUD (Create, Read, Update, Delete) operations on student records.
The system is tested using Postman and demonstrates the core backend development concepts using Spring Boot and JPA/Hibernate.

Technologies Used:-
->Backend: Java, Servlets, JDBC
->Database: MySQL
->Testing Tool: Postman
->IDE: Eclipse
->Build Tool: Maven

Features:-
->Add new student details (POST)
->View all students or a specific student (GET)
->Update student information (PUT)
->Delete student record (DELETE)
->Lightweight and easy-to-understand API structure

Database Details:-
Database Name: studentdb
Table Name: students

Sample Table Structure:

Column Name   	   Data Type         	    Description
id	            INT(Primary Key)	      Student ID
name          	VARCHAR(100)	          Student Name
branch         	VARCHAR(100)	          Student Branch
marks	          VARCHAR(50)	            Course Marks

How to Run the Project:-
1.Install JDK 17+ and MySQL Server.
2.Create a database named studentdb.
3.Update your database credentials in the application.properties file:
     spring.application.name=SpringBootRestAPIProject29
     spring.datasource.url=jdbc:mySql://localhost:3306/springboot_db29
     spring.datasource.username=root
     spring.datasource.password=root
     server.port=8088
     spring.jpa.hibernate.ddl-auto=update
     spring.jpa.show-sql=true
4.Open the project in Eclipse.
5.Run the application as a Spring Boot App.
6.Open Postman in browser.

Operation	Method	       Endpoint	                Description
Create	POST	         /students/add	          Add a new student
Read	GET              /students	              Get all students
Read by ID	GET	       /students/{id}	          Get student by ID
Update	PUT	           /students/update/{id}	  Update student details
Delete	DELETE	       /students/delete/{id}	  Delete student record

How It Works in Postman:-

1.Start your Spring Boot app
2.Run it from Eclipse → Right click → Run As → Spring Boot App
3.It starts on http://localhost:8080
4.Open Postman
5.You’ll use it to send requests (GET, POST, PUT, DELETE) to your API.
6.View Output Responses in Postman
7.When you send a request, Postman shows the response JSON directly — that’s your program’s “output.”

Example:
GET → http://localhost:8080/students

API Endpoints:-

HTTP Method       	Endpoint	           Description	
GET               	/students	         Get all students	
GET	                /student/{id}      Get student by ID
POST	              /add	             Add new student	
PUT               	/update/{id}	     Update student details	
DELETE	            /delete/{id}	     Delete student by ID	

Example JSON for POST/PUT
{
  "name": "Madhav",
  "branch": "Computer Science",
  "marks": 88
}

Example Postman Requests:-

1.GET all students
GET http://localhost:8080/students

2.GET student by ID
GET http://localhost:8080/student/1

3.POST (Add student)
POST http://localhost:8080/add

4.PUT (Update student)
PUT http://localhost:8080/update/1

5.DELETE (Delete student)
DELETE http://localhost:8080/delete/1

Output in Postman:-
All the CRUD operations are tested using Postman.
When you send a request, the output (response JSON) is displayed in Postman, for example: GET → /students

{
    "id": 1,
    "name": "madhav",
    "branch": "ece",
    "marks": 85.0
}
{
    "id": 2,
    "name": "arun",
    "branch": "eee",
    "marks": 85.0
}

-<img width="2240" height="1400" alt="Screenshot 2025-11-04 121650" src="https://github.com/user-attachments/assets/e4dc9844-f84c-4cc1-9064-5ed695907d5f" />

Developer:
Developed by: Madhav
Type: Individual Mini Project
Tested using: Postman




