# Taxi service

This project is a simple realization of "taxi service" system. 
User can log in as a driver (or register).
The following features are available after *authentication*:
> * Add new car, driver, manufacturer.
> * Add driver to car
> * Show list of all:
>  * cars with information about each car and list of drivers assigned to the car.
>  * registered drivers with information about each driver.
>  * car's manufacturers with information about each manufacturer.
> * Delete:
>  * car, all drivers will be unassigned from deleted car.
>  * driver, driver will be unassigned from previously assigned cars.
>  * manufacturer.
## Implementation details
  > The project is designed according to the principles of SOLID,
  > Dependency injection and Inversion of control.
  > Project based on famous 3-layered architecture:
> 1. Data access layer (DAO)
> 2. Application layer (service)
> 3. Presentation layer (controllers)
## Technologies
> * Apache Tomcat 
> * MySQL
> * JDBC
> * Servlet
> * JSP
> * JSTL
> * HTML, CSS
> * Maven Checkstyle Plugin
## Setup
>1. Install: 
>   * IntelliJ IDEA Ultimate
>   * ApacheTomcat
>   * MySQL and MySQL Workbench
> 2. Clone this project into your IDE
> 3. In MySQL Workbench run the script from resources/init_db.sql
>     * **Pay attention: if you have a schema with the name "taxi" it will be replaced**
> 4. In taxi/util/ConnectionUtil change constants:
```
     private static final String URL = "YOUR URL TO DB";
     private static final String USERNAME = "YOUR USERNAME FOR ACCES TO DB";
     private static final String PASSWORD = "YOUR PASSWORD FOR ACCES TO DB";
     private static final String JDBC_DRIVER = "YOUR JDBC DRIVER PATH";
```
> 5. Configure TomCat Local server (Add New Configuration -> TomCat -> Local -> Fix -> taxi-service:war exploded -> OK)
> 6. Also, if you want to use logger change full path in resources/log4j2.xml file
