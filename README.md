# Page object Model pattern sample - BLANKFACTOR

 This project contains an example of the page object model pattern, where we try to show multiple ways to organize and implement different tools, methods, functions, etc, but without forgetting the design pattern

### Tools used to create this project:

- Selenium
- Junit

## Description of the Packages in this project

This project is divided in these packages: pages, tests and resources.


### Pages:
Contains the page object classes where mapping the elements, interaction and assert methods

### Tests:

Contains the tests clases,this is where the tests cases are written.

### Resoucers:
Contains all the additional files and resources needed for the automation. Like drivers, config files or data files.

### Other files:

- tests.BaseTest: class contains all common functionalities and variables of test classes and all test classes extend this BaseTest class.



# Pre-requisites📋
1. Java v1.8 update 151 or higher And JDK (Environment variables configurated)
2. Gradle v5.2.1 o superior
3. ChromeDriver 90.0 o latest stable version according to the actual version of chrome version

# Install 🔧
- Importar el proyecto desde Eclipse o Intellij IDE bajo la estructura de un proyecto Gradle existente.
- Configurar JRE System Library con JavaSE-1.8
- Configurar la codificación a UTF-8 al proyecto una vez sea importado.


# Compile the project 🔨
- To compile the project should execute the command: gradle clean build -x test


# To execute the tests ⚙️

### Exectucion commands 💻

- To run all the tests of the project locally using gradle, type the command: `gradle clean test`
- execute specific test: `gradle clean test --tests "tests.testName" --info`


