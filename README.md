Web Application BDD Test using Java, Cucumber, and Selenium

This project contains sample tests for a web application using Java, Cucumber, and Selenium. It includes scenarios to verify that a new user can create an account, validate error messages for each invalid login scenario, and verify that a user can log in successfully with valid login credentials.

## Prerequisites

- Java JDK installed
- Maven installed
- Chrome browser (or Firefox) installed

## How to Run the Tests

1. Clone this repository to your local machine.
2. Navigate to the project root directory.
3. Open the `config.properties` file and configure the `URL` and `browser` properties as needed.
4. Run the tests using Maven:, 
Verified that new user can create an account,
Validated error messages for each invalid login scenario,
Verified user can login successfully with valid login credentials.

mvn test

## Test Scenarios

### Common.feature

### Createnewuseraccount.feature

### Invalidloginfeature

### Login.feature

## Test Execution

The Cucumber scenarios are defined in the `.feature` files, and the step definitions are implemented in Java files located in the `Step_definition` package. The tests are executed using the JUnit Runner class `RunnerClass.java`.

## Page Objects

The `Pages` package contains Page Objects that represent the web elements and actions for each page in the application.

## Configuration

You can configure the URL and browser for testing in the `config.properties` file.

---
Note: The provided code snippets and directory structure assume that the project is organized accordingly. Please ensure that the directory structure and file names match the code snippets to ensure successful execution.
