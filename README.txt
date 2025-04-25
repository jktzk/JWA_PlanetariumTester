Planetarium Test Automation Suite

This project is an automated testing suite built for a Planetarium web application. The app allows users to register, log in, and manage celestial objects like planets and moons. The goal of this suite is to validate key workflows through UI automation using Selenium and Cucumber.

What It Does:

- Tests user registration with valid and invalid input
- Tests user login with both correct and incorrect credentials
- Automates the addition of planets, with optional image uploads
- Verifies that added planets appear in the table correctly
- Checks if uploaded images are truly visible (not just present)
- Automates moon deletion and validates the resulting table state
- Includes sad path coverage for things like invalid deletion and form errors

Tech Stack:

- Java
- Selenium WebDriver
- Cucumber with Gherkin syntax
- JUnit
- Maven for dependency management

Structure:

- `pom.xml` handles all dependencies
- `step/` contains the Cucumber step definitions
- `pom/` contains page object classes tied to specific web pages
- `features/` holds Gherkin test cases for each functionality
- `CucumberHooks.java` resets the backend state before each test scenario

Notes:
This suite is meant to be a reliable foundation for UI regression testing in the Planetarium project. It can be extended to include more edge cases or integrated into a CI/CD pipeline down the line.
