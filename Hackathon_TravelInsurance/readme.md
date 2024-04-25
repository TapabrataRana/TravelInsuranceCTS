Find travel insurance plan for students
----------------------------------------
 
Problem Statement : Find travel insurance plan for students
------------------------------------------------------------
 
	1.display three lowest international  travel insurance plan with amount and insurance provider company
	2.Group of  2 student people (Age 22,21)
	3.For any European country
	(Suggested Site: policybazaar however you are free to use any other legitimate site)
___________________________________________________________________________________________________________________________	

 
Detailed Description: Hackathon Ideas
------------------------------------
 
	1.Find travel insurance plan for students, for 2 people (Age 22 & 21) & any European country, fill further dummy details & display three lowest international  travel insurance plan with amount and insurance provider company
	2.Get a Car Insurance quote, proceed without  car number, keep filling details, give invalid email or phone number & capture the error message
	3.Retrieve all Health Insurance menu items and store in a List; Display the same
	(Suggested Site: policybazaar.com however you are free to use any other legitimate site)
____________________________________________________________________________________________________________________________	

 
Key Automation Scope
---------------------
 
	1.Handling alerts, search option
	2.Validation of date controls
	3.Filling simple form, Capture warning message
	4.Extract menu items & store in collections
	5.Navigating back to home page
__________________________________________________________________________________________________________________________	
 
 
Console Output
---------------
 
[Niva Bupa (formerly known as Max Bupa), Reliance, Bajaj Allianz]
[₹1,543, ₹1,686, ₹1,920]
 
Please enter valid email address
 
Family Health Insurance
Senior Citizen Health Insurance
Health Insurance for Parents
Best Health Insurance Plans
Maternity Insurance
Health Insurance Portability
Mediclaim Policy
Critical Illness Insurance
Health Insurance Calculator
Health Insurance Companies
Health Insurance for NRIs
Health Insurance Claim
_________________________________________________________________________________________________________________________
 
 
Dependency
-----------
 
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>Hackathon_TravelInsurance</groupId>
  <artifactId>Hackathon_TravelInsurance</artifactId>
  <version>0.0.1-SNAPSHOT</version>
 
<dependencies>
 
	<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
	<dependency>
	    <groupId>org.seleniumhq.selenium</groupId>
	    <artifactId>selenium-java</artifactId>
	    <version>4.18.1</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
	<dependency>
	    <groupId>io.github.bonigarcia</groupId>
	    <artifactId>webdrivermanager</artifactId>
	    <version>5.8.0</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
	<dependency>
	    <groupId>org.apache.poi</groupId>
	    <artifactId>poi</artifactId>
	    <version>5.2.5</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
	<dependency>
	    <groupId>org.apache.poi</groupId>
	    <artifactId>poi-ooxml</artifactId>
	    <version>5.2.5</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/commons-io/commons-io -->
	<dependency>
	    <groupId>commons-io</groupId>
	    <artifactId>commons-io</artifactId>
	    <version>2.16.0</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/org.apache.commons/commons-lang3 -->
	<dependency>
	    <groupId>org.apache.commons</groupId>
	    <artifactId>commons-lang3</artifactId>
	    <version>3.14.0</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api -->
	<dependency>
	    <groupId>org.apache.logging.log4j</groupId>
	    <artifactId>log4j-api</artifactId>
	    <version>3.0.0-beta2</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/org.testng/testng -->
	<dependency>
	    <groupId>org.testng</groupId>
	    <artifactId>testng</artifactId>
	    <version>7.9.0</version>
	    <scope>test</scope>
	</dependency>
	<!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->
	<dependency>
	    <groupId>com.aventstack</groupId>
	    <artifactId>extentreports</artifactId>
	    <version>5.1.1</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
	<dependency>
	    <groupId>io.cucumber</groupId>
	    <artifactId>cucumber-java</artifactId>
	    <version>7.16.1</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-testng -->
	<dependency>
	    <groupId>io.cucumber</groupId>
	    <artifactId>cucumber-testng</artifactId>
	    <version>7.16.1</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
	<dependency>
	    <groupId>io.cucumber</groupId>
	    <artifactId>cucumber-junit</artifactId>
	    <version>7.16.1</version>
	    <scope>test</scope>
	</dependency>
 
	<!-- https://mvnrepository.com/artifact/tech.grasshopper/extentreports-cucumber7-adapter -->
	<dependency>
	    <groupId>tech.grasshopper</groupId>
	    <artifactId>extentreports-cucumber7-adapter</artifactId>
	    <version>1.14.0</version>
	</dependency>
</dependencies>
 
	<build>
    <pluginManagement>
      <plugins>
        <plugin>
          <groupId>org.apache.maven.plugins</groupId>
          <artifactId>maven-compiler-plugin</artifactId>
          <version>3.13.0</version>
        </plugin>
        <plugin>
          <groupId>org.apache.maven.plugins</groupId>
          <artifactId>maven-surefire-plugin</artifactId>
          <version>3.2.5</version>
          <configuration>
          	<suiteXmlFiles>
          		<suiteXmlFile>testng.xml</suiteXmlFile>
          	</suiteXmlFiles>
          </configuration>
        </plugin>
      </plugins>
    </pluginManagement>
  </build>
 
 
</project>