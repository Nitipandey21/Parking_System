# Parking_System
Simple CRUD app which helps parking space owners manage the parking space.

Functional requirements

1.	To get free and allocated parking space information.
2.	To book a specific parking space for a car of specific dimensions.
3.	To release a parking space - when the car there moves out

Technologies

Backend technologies:

Java
Spring Boot
Spring MVC
Object Relational database (JpA)

Development cycle tools:

Postman
Eclipse IDE
GitHub 
Tomcat server version 9
MySql Workbench

Assumptions

we Asssume the Car attribute in Car Table AS
Name ,length,breadth, Isreleased,Parking_type

and no of lot for each type of area
●	small 4 * 2.5 M - 5
●	medium 5 * 3 M- 10
●	large 7 * 4 M- 15

Run Services As--

1.To get free and allocated parking space information.

use- http://localhost:8081/api/parking

get json with all prking type free space.

2.	To book a specific parking space for a car of specific dimensions.

use- http://localhost:8081/api/car

By giving Json in body 

testcase-

{
"name":"honda",
"length":2,
"breadth":5
}
 get return json about all status of your  parking booking.

3.To release a parking space - when the car there moves out

use- http://localhost:8081/api/parkings

By selecting id in header

get json in response with isreleased flag true.
