## Sauce Labs Appium Project
This project designed using framework: selenium and POM.

## Install
1) App Name: “Android.SauceLabs.Mobile.Sample.app.2.7.1.apk”
2) APK link: https://github.com/saucelabs/sample-appmobile/releases/download/2.7.1/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk


## Run 
Device: Android
1) Connect mobile and pc using cable
2) enable USB debugging from settings
3) run appium server on your pc
4) Open LoginTest class --> click on Run All or from testng.xml file

## Description 
you can see in the project explorer 2 packages:
 1) Pages --> contains 2 classes
      - BasePage class that conatins generic methods. 
      - loginPage class that contains loctaors and method of login mobile page.
   
  2) Tests--> contains 2 classes
      - BaseTest class that conatins setup methods (before & after tests). 
      - logintest class that contains all test cases based on loginPage implementation.
          Test cases: cover a positive and a negative scenario with assert every test cases.

 ## Report
 prerequisite:

Download Allure binaries(zip) and set the Path
to run report run all tests from testng.xml file first then Report 1 (allure report): open allureresult folder in system explorer --> run cmd command"allure serve", it will display allure report in a new broswer.

Report 2 (Extent report): open test-output folder and click on index.html, it will display allure report in a new broswer.
