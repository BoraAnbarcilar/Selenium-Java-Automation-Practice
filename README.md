git add README.md src/README.md#  Herokuapp Selenium Test Automation Project

This repository serves as a comprehensive QA portfolio, showcasing the full testing lifecycle—from initial requirements analysis to automated execution and reporting.

---

##  1. Software Requirements Specification (SRS-2026-001)

### **Project Description**
- **Project:** Herokuapp Test Automation Portfolio
- **Module:** User Login Panel
- **Priority:** Critical (P0)

### **Acceptance Criteria (AC)**
- **AC.01:** The Login URL must be: `https://the-internet.herokuapp.com/login`
- **AC.02:** The system must allow access with valid credentials (`tomsmith` / `SuperSecretPassword!`).
- **AC.03:** Upon successful login, the message **"You logged into a secure area!"** must be displayed.
- **AC.04:** When login is attempted with invalid credentials, the system must display the **"Your username is invalid!"** warning.

---

##  2. Test Cases & Execution Summary

This table summarizes the manual test design and its automated execution results.

| Test ID | Description | Test Data | Expected Result | Actual Result | Status |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **TC001** | Successful Login | `tomsmith` | User redirected to `/secure` page. | Logged in successfully, message verified. | ✅ PASSED |
| **TC002** | Invalid Login | `wrong_user` | "Your username is invalid!" message. | Error message displayed correctly. | ✅ PASSED |

> [!IMPORTANT]
> Detailed Excel and PDF reports are available in the [docs/](./docs/) folder.

---

## 🛠 3. Tech Stack & Environment

- **Language:** Java
- **Automation:** Selenium WebDriver
- **Test Framework:** JUnit 5
- **Build Tool:** Maven
- **Design Pattern:** Data-Driven Testing (via config.properties)

---

##  4. Project Structure

```text
├── src/test/java           # Selenium Test Scripts
├── src/test/resources      # Test Data (config.properties)
├── docs/                   # Project Documentation
│   ├── Test_Execution_Report_Herokuapp.xlsx   # Main Excel Document
│   └── scenarios/
│       └── Test_Scenarios_Report.pdf          # Final PDF Report
├── pom.xml                 # Dependencies (Selenium, JUnit, etc.)
└── README.md               # Main Project Overview  
```
---

## 🚀 5. Getting Started

### **Prerequisites**
- Java JDK 11 or higher
- Maven installed
- Google Chrome browser

### **Execution Steps**

1. **Clone the project:**
   `git clone https://github.com/kullanici-adin/Selenium-Authentication-Project.git`

2. **Navigate to the directory:**
   `cd Selenium-Authentication-Project`

3. **Run all tests:**
   `mvn test`

---
