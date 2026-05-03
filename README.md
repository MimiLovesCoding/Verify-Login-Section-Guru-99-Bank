# 🏦 Guru99 Bank ➖ Login Verification Test Suite<b>
A Selenium WebDriver automation project built in Java using TestNG to verify the login functionality of the Guru99 Bank demo application.<br>
The test suite covers positive and negative login scenarios, cross-browser compatibility, and prioritized test execution<br>
with results captured in a TestNG HTML report.<br>

## 📋 Project Overview
### 🎯 Scenario
A client (ABC Company) requested an expanded test suite for the Guru99 Bank login section.<br>
The original single positive test case was enhanced to include additional negative test cases, improving overall coverage and robustness.<br>
### 💡 Solution<br>
The test suite was expanded from one positive case to four total test cases, one positive and three negative, using the following TestNG features:<br>

🔢 @Test(priority=) ➖ to sequence test execution efficiently within a three-week sprint<br>
📐 @Parameters ➖ to run all scenarios across multiple browsers without duplicating code<br>
🔀 Cross-browser execution ➖ Chrome, Firefox, Microsoft Edge, and Safari<br>
📚 TestNG HTML reporting ➖ an index.html report was generated upon completion for full test verification<br>

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
|1. Valid username and password| ✅ Positive |Login succeeds ➖ user redirected to dashboard |
|2. Invalid username, valid password| ❌ Negative| Login fails ➖ error message displayed|
|3. Valid username, invalid password| ❌ Negative| Login fails ➖ error message displayed|
|4. Empty username and password fields| ❌ Negative| Login fails ➖ validation message displayed|
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
|testng.xml| TestNG suite configuration➖ defines browsers, test order, and execution parameters|
|package-info.java |Package-level documentation and annotations |

<hr> 

## 📊 TestNG HTML Report Results
💻 Test Execution Summary \ index.html report

![image](https://github.com/user-attachments/assets/c42c8b4f-e291-447a-a998-a6b5391d1d7f)

<hr>
## ⌛ Cross-Browser Execution / index.html report detailing the Time-Saving Benefit of Parallel Browser Testing<br>
         
![image](https://github.com/user-attachments/assets/26ff4bfb-2ba6-467c-94eb-de6404626e0b)
<hr>

## ▶️ How to Run This Test Suite<br>

#### Prerequisites<br>
🔧 Java JDK 8 or higher — Download Here<br>
🔧 Eclipse or IntelliJ IDEA<br>
🔧 Selenium WebDriver JAR files added to your project build path<br>
🔧 TestNG plugin installed in your IDE<br>
🔧 Browser drivers (ChromeDriver, GeckoDriver, EdgeDriver) installed and configured<br>

#### 🪜Setup Steps<br>

1. Clone or download this repository to your local machine<br>
2. Open the project in Eclipse or IntelliJ IDEA<br>
3. Add Selenium and TestNG libraries to your project build path<br>
4. Ensure all browser drivers are installed, and their paths are configured in your system<br>
5. Update any credential or URL references in testUserIdandPassword.java to match the Guru99 demo environment<br>

### 💻 Running the Tests
#### Option 1 — Run via TestNG XML (recommended for cross-browser):<br>

Right-click testng.xml<br>
Select Run As → TestNG Suite<br>
All browsers will execute in sequence<br>

#### Option 2 — Run individual test class:<br>

Right-click testUserIdandPassword.java<br>
Select Run As → TestNG Test<br>

#### Viewing Results<br>
After execution, navigate to the test-output folder in your project directory and open index.html in a browser to view the full TestNG report.<br>
<hr> 

## 📚 Key Takeaways<br>
🎯 Gained hands-on experience expanding a test suite from a single positive case to a full set of positive and negative scenarios based on client requirements<br>
🎯 Learned how to use @Test(priority=) to control test execution order efficiently within a sprint timeline<br>
🎯 Practiced cross-browser testing using @Parameters in TestNG — running the same test suite across Chrome, Firefox, Edge, and Safari without duplicating code<br>
🎯 Strengthened understanding of how parallel and parameterized test execution reduces overall testing time while increasing coverage<br>
🎯 Gained experience interpreting and sharing TestNG HTML reports as a verification artifact for stakeholders<br>
🎯 Reinforced the importance of negative testing — confirming that the application correctly rejects invalid inputs is as critical as confirming it accepts valid ones<br>
<hr>

## 🚀 Future Improvements<br>
🔲 Add data-driven testing using Excel or CSV files for broader input coverage<br>
🔲 Implement Page Object Model (POM) design pattern for improved maintainability<br>
🔲 Integrate with a CI/CD pipeline for automated test execution on each build<br>
🔲 Expand test coverage to additional banking workflows beyond login<br>
