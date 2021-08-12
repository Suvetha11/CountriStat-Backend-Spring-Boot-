# <p align="center">CountriStat-Backend(Spring Boot)</p>
<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li><a href="#about-the-project">About The Project</a></li>
    <li><a href="#application-preview">Application Preview</a></li>
    <li><a href="#step-by-step-guide-to-build-an-api-in-spring-boot">Step by Step guide to build an API in Spring Boot</a></li>
  </ol>
</details>

## <p align="center">About the project</p>

This is an CRUD Angular application that consumes from the Spring Boot backend with H2 as the database. The application will display countries of the world, and the user can manipulate them via different operations (Create, Read, Update, Delete Country/Countries). This project contains only about building an API in Spring Boot. Please visit the following link to check how to setup a project with angular 9  and connect it with the spring boot : https://github.com/Suvetha11/CountriStat-FrontEnd-Angular-

## <p align="center">Application Preview</p>

![App Screenshot](https://github.com/Suvetha11/CountriStat-Backend-Spring-Boot-/blob/main/Images/CountriStat_Preview_Screenshot.png)

## Step by Step guide to build an API in Spring Boot

### Step 1 : Create a new Spring Project add the jpa, and Web and H2 dependencies.
#### Step 1.1 :
  ![Create new spring project1](https://github.com/Suvetha11/CountriStat-Backend-Spring-Boot-/blob/main/Images/new%20project%20ss1.png)
#### Step 1.2 :
  ![Create new spring project2](https://github.com/Suvetha11/CountriStat-Backend-Spring-Boot-/blob/main/Images/new%20project%20ss2.png)
#### Step 1.3 :
  ![Create new spring project3](https://github.com/Suvetha11/CountriStat-Backend-Spring-Boot-/blob/main/Images/new%20project%20ss3.png)
#### Step 1.4 :
  ![Create new spring project3](https://github.com/Suvetha11/CountriStat-Backend-Spring-Boot-/blob/main/Images/new%20project%20ss4.png)
  
### Step 2 : Add the CountryController.java, Country.java, CountryService.java and CountryRepository.java files inside com.example.countriesapi package which is under src->main->java folder. 
  Refer to the codes given for each file in the project from this repository.
  
### Step 3 : Then also create the data.sql file under resources which contains some initial sql query to add some initial data mentioned below. H2 database is used in this project. 

```
CREATE TABLE COUNTRIES(
 id INT AUTO_INCREMENT PRIMARY KEY,
 country_name VARCHAR(200) NOT NULL,
 capital_name VARCHAR(200) NOT NULL
);

insert into COUNTRIES values(1,'Sri Lanka', 'Colombo');
insert into COUNTRIES values(2,'India', 'New Delhi');
insert into COUNTRIES values(3,'USA', 'New York');
insert into COUNTRIES values(4,'England', 'London');
```

### Step 4 : Add the below code in your application.properties file.

```
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=update
spring.datasource.platform=h2 
spring.datasource.url=jdbc:h2:mem:countrydb
```
### Step 5 : Run the project and open the h2-console and connect to the database to check whether the records are available in the table.

#### Step 5.1 : Click on connect button 
![h2-console](https://github.com/Suvetha11/CountriStat-Backend-Spring-Boot-/blob/main/Images/h2-console.png)

#### Step 5.2 : Run the sql code to check the data.
![db data](https://github.com/Suvetha11/CountriStat-Backend-Spring-Boot-/blob/main/Images/db.png)






