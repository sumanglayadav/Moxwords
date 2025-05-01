# Selenium Java Maven Project

This project is a Selenium-based automation framework built using Java and Maven. It is designed to demonstrate how to set up a simple test automation project that redirects to a specified URL and verifies the page title.

## Project Structure

```
selenium-java-maven-project
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── example
│   │               └── App.java
│   └── test
│       └── java
│           └── com
│               └── example
│                   ├── BaseTest.java
│                   └── RedirectTest.java
├── pom.xml
└── README.md
```

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Maven
- An IDE (e.g., IntelliJ IDEA, Eclipse)

## Setup Instructions

1. **Clone the repository:**
   ```
   git clone <repository-url>
   cd selenium-java-maven-project
   ```

2. **Build the project:**
   ```
   mvn clean install
   ```

3. **Run the tests:**
   ```
   mvn test
   ```

## Dependencies

This project uses the following dependencies:

- Selenium WebDriver
- TestNG
- WebDriverManager

These dependencies are specified in the `pom.xml` file.

## Running Tests

To run the tests, use the following command:
```
mvn test
```

This will execute the test cases defined in `RedirectTest.java`, which will navigate to the specified URL and verify the page title or other elements.

## Contributing

Feel free to fork the repository and submit pull requests for any improvements or bug fixes.

## License

This project is licensed under the MIT License. See the LICENSE file for more details.