# 🏦 Guru99 Bank — Login Verification Test Suite<b>
A Selenium WebDriver automation project built in Java using TestNG to verify the login functionality of the Guru99 Bank demo application.<br>
The test suite covers positive and negative login scenarios, cross-browser compatibility, and prioritized test execution<br>
with results captured in a TestNG HTML report.<br>

## 📋 Project Overview
### 🎯 Scenario
A client (ABC Company) requested an expanded test suite for the Guru99 Bank login section.<br>
The original single positive test case was enhanced to include additional negative test cases, improving overall coverage and robustness.<br>
### 💡 Solution<br>
The test suite was expanded from one positive case to four total test cases, one positive and three negative, using the following TestNG features:<br>

🔢 @Test(priority=) — to sequence test execution efficiently within a three-week sprint<br>
📐 @Parameters — to run all scenarios across multiple browsers without duplicating code<br>
🔀 Cross-browser execution — Chrome, Firefox, Microsoft Edge, and Safari<br>
📚 TestNG HTML reporting — an index.html report was generated upon completion for full test verification<br>

✅All four positive test cases passed.<br> 
✖️All negative test cases failed as expected per client specifications, confirming correct validation behavior.<br>
<hr>

## 🛠 Tools & Technologies
|Tool |Purpose |
|--- | --- |
|Java |Primary programming language for test automation| 
|Selenium WebDriver |Browser automation framework| 
|TestNG |Test execution, annotation management, and HTML reporting|
|Chrome / Firefox / Edge / Safari | Cross-browser compatibility testing |
|Eclipse / IntelliJ IDEA | IDE for development and test execution|
|Guru99 Bank Demo App | Application under test |

<hr>

## 🧪 Test Cases Covered
| Test Case |Type  |Expected Result| 
|--- | --- | --- |
|1. Valid username and password| ✅ Positive |Login succeeds — user redirected to dashboard |
|2. Invalid username, valid password| ❌ Negative| Login fails — error message displayed|
|3. Valid username, invalid password| ❌ Negative| Login fails — error message displayed|
|4. Empty username and password fields| ❌ Negative| Login fails — validation message displayed|
<br>
<hr>

## 🌐 Cross-Browser Testing
Tests were parameterized using @Parameters to execute across four browsers in a single run:<br>
|Browser | Status |
|--- |--- |
|Google Chrome |✅ Executed |
|Mozilla Firefox | ✅ Executed|
|Microsoft Edge| ✅ Executed|
|Safari   |✅ Executed|
<hr>

## 📈 Code Structure
|File   |Purpose |
|---  |--- |
|LaunchDrivers.java |Initializes and configures the WebDriver for each browser using @Parameters| 
|testUserIdandPassword.java |Contains all test cases for login validation with @Test(priority=) sequencing|
|testng.xml| TestNG suite configuration — defines browsers, test order, and execution parameters|
|package-info.java |Package-level documentation and annotations |

<hr>          
💻 index.html report from Testng test-output selection

![image](https://github.com/user-attachments/assets/c42c8b4f-e291-447a-a998-a6b5391d1d7f)


<hr>
💡 Solution: The test scenario was expanded from a single positive case to include three additional negative test cases, enhancing the 
   coverage and robustness of the testing process. To optimize test execution during the three-week sprint, the @Test annotation with the 
   priority attribute was utilized, assigning numerical priorities to the test cases for efficient sequencing. Additionally, the 
   @Parameters annotation was implemented, enabling the execution of all test scenarios across multiple browsers, including Chrome, 
   Firefox, Microsoft Edge, and Safari, to ensure cross-browser compatibility.

   Validations were systematically applied to confirm the accuracy of each test case's pass or fail status. Upon completion, an index.html
report was generated, providing a comprehensive summary for further test verification. The results showed that all 
   four positive test cases passed, while the negative test cases failed as per client specifications, validating the expected behavior.
   


<hr>
⌛ index.html report detailing the time-saving benefit of executing compatibility tests across multiple browsers.
         
![image](https://github.com/user-attachments/assets/26ff4bfb-2ba6-467c-94eb-de6404626e0b)

