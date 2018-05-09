Requirements
------------
- Java 1.7+.
- Maven 3.

Software base
-------------
- Front-End: 
	- [AngularJS v1.5.8]

- Back-End: 
	- [Sprint-boot v1.4.0RELEASE]

Project Structure
--------------------------------------
- `src/main/java`:
    - Spring Boot java classes.
- `src/main/resources/static`:
    - AngularJS javascript, css and html files.
- `pom.xml`: manven file with all the dependencies for the project. 
- `src/main/resources/application.yml`: spring boot configuration file, you can change the http port in this file,
default value 29090, if you change the port in configuration file you need to change the port in the AngularJS app javascript file as well (`src/main/resources/static/js/app/app.js` line 4).

Compile and Run
---------------
- Go to the home folder (e.g. buzzmove-test) and run the maven commands `mvn clean install`.
- After finished the compile and create the jar file (buzzmove-test.jar), to run the project you need to run the java command
in the home folder of the project, `java -jar target/buzzmove-test.jar`.
- When the application is runnning, open this url in a browser to test the application `http://localhost:29090/index.html`.