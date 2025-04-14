---

# 🎓 College Management System

This is a Java-based **college management system** project that follows a **modular MVC (Model–View–Controller)** architecture. The system is designed to help colleges manage students, teachers, and administrative operations efficiently.

It includes features like user authentication, dashboards for different user roles (admin, teacher, student), and CSV file import functionalities.

---

## 🚀 Key Features

- 🔐 **Login and Authentication System**
- 🧑‍🎓 **Student & Teacher Dashboard Interfaces**
- 🧾 **CSV Reader** for batch data imports
- 🗂️ **Admin Controls** for managing users and records
- 💼 **Admission Office Support**
- 🧪 **Form Validation & Credential Checks**

---

## 🧰 Technologies Used

- **Java 17+**
- **JavaFX**
- **Maven** – Dependency management (`pom.xml`)
- **MVC Architecture**
- **Java I/O** – For CSV file handling

---

## 📁 Project Structure

```
src/
└── main/
    ├── java/com/example/main/
    │   ├── AdminController.java
    │   ├── LoginController.java
    │   ├── StudentDashboardController.java
    │   ├── TeacherDashboardController.java
    │   ├── CsvReader.java
    │   ├── ValidateCredentials.java
    │   └── ...
    └── resources/com/example/main/
        └── (FXML/Config/Other Resources)

```

---

## ⚙️ Getting Started

1. Clone the repo:
    
    ```bash
    git clone https://github.com/BishalPoudel-1/college-management-system.git
    cd college-management-system
    
    ```
    
2. Open in an IDE like IntelliJ or Eclipse.
3. Build the project using Maven:
    
    ```bash
    mvn clean install
    
    ```
    
4. Run the application:
    - Use `HelloApplication.java` or a specified main class.
    - Make sure your Java version is compatible with the project.

---
