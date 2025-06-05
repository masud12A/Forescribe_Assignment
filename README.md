QA Automation Internship Assessment - ForescribeAssignment:

Overview:
This repository contains the automated test suite for the login functionality of the OrangeHRM demo site using Java, Selenium WebDriver, and TestNG. The project validates the login workflow by verifying user redirection to the dashboard after successful login.

Features
Page Object Model (POM) design pattern implemented for scalable and maintainable code.

Parameterized tests using TestNG DataProviders with Excel data source.

Support for multiple browsers (Chrome, Edge, Firefox) via TestNG XML configurations.

Remote and local WebDriver execution based on config properties.

ExtentReports integration for detailed and visually appealing test reports.

Debugging best practices with explicit waits to handle element interaction issues.

Project Structure
pageObjects/ - POM classes like LoginPage, DashboardPage, and BasePage

testCases/ - TestNG test classes

testBase/ - WebDriver setup and teardown base class

utilities/ - Helper classes for Excel handling, DataProviders, ExtentReports

testdata/ - Excel file with login credentials

resources/ - Config properties file

reports/ - Generated HTML test reports

How to Run
Clone the repo.

Set desired browser and environment in config.properties.

Run tests via TestNG XML files (master.xml for single browser or multibrowser.xml for parallel multi-browser).

View the generated ExtentReports in the reports folder.

Debugging Approach
Handled common Selenium ElementNotInteractableException by applying explicit waits and JavaScript scrolling, enhancing test stability and reliability.
