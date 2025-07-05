# Order Processing System

A Java-based Order Processing System built using **Maven**, **OOP principles**, and **JUnit 5** for testing.

This project demonstrates how to use a rules-based engine to process different types of orders such as maintenance applications and contracts, and simulate email notifications, following clean code and Test-Driven Development (TDD) practices.

---

## 📁 Project Structure

```
order-processing-system/
├── src/
│   ├── main/java/com/order/...
│   └── test/java/com/order/...
├── pom.xml
└── README.md
```

## 🚀 How to Run the Application

> **Ensure Java and Maven are installed and configured (`java -version`, `mvn -version`)**

1. Open terminal in project root:
   ```bash
   cd order-processing-system
   ```

2. Run the application:
   ```bash
   mvn clean compile exec:java -Dexec.mainClass="com.order.Main"
   ```

You should see console output like:

```
🔁 Renewed maintenance for 'ERP System' for customer: Venkat
📧 Email sent to venkat@example.com
Subject: Maintenance Renewed
Body: Your maintenance for ERP System has been successfully renewed.
```

---

## 🧪 How to Run Tests

JUnit 5 is used for unit testing. Tests are located in `src/test/java`.

To run tests:

```bash
mvn test
```

You’ll see test output like:

```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.order.rules.MaintenanceRuleTest
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS
```

---

## 🛠 Technologies Used

- Java 22
- Maven 3.9.10
- JUnit 5
- Clean Code & OOP Design
- TDD (Test-Driven Development)

---

## ✅ Features

- Processes application and contract maintenance orders
- Applies business rules based on product type
- Sends simulated email notifications
- JUnit tests to ensure rule logic works
- Easily extendable to more business rules

---

##  Author

**Venkat Raju**  
GitHub: [@venkataraju0707](https://github.com/venkataraju0707)
