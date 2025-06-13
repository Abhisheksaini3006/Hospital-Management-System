# 🏥 Hospital Management System (Java + MySQL)

A simple console-based Hospital Management System built in Java using JDBC and MySQL.  
This project helps manage patient and doctor records including storing details, adding entries, and viewing all data in a structured way.

> 📌 Developed as a mini project for learning JDBC, database handling, and OOP concepts in Java.

---

## 💡 Features

- Add and view patient records
- Add and view doctor records
- Uses object-oriented design (`Patient`, `Doctor`, `Person`)
- MySQL-based backend for persistent data storage
- Simple command-line UI

---

## 🛠️ Tech Stack

- **Java (JDK 8+)**
- **MySQL**
- **JDBC (Java Database Connectivity)**
- **Object-Oriented Programming (OOP)**

---

## 📂 Project Structure

```
src/
├── HospitalManagement.java   # Main program logic and menu
├── Patient.java              # Patient class extending Person
├── Doctor.java               # Doctor class extending Person
├── Person.java               # Common base class
├── DBConnection.java         # Handles MySQL connection
```

---

## ⚙️ How to Run (Installation & Setup)

> Follow all steps below carefully to run the project successfully.

```
1. 🧰 Prerequisites:
   - Java (JDK 8 or higher) installed
   - MySQL Server installed and running
   - Any Java IDE (like IntelliJ, Eclipse, or VS Code with extensions)

2. 🛢️ Create MySQL Database:
   - Open MySQL command line or use MySQL Workbench
   - Run the following commands to set up database and tables:

   CREATE DATABASE hospital_db;

   USE hospital_db;

   CREATE TABLE patients (
     patient_id INT PRIMARY KEY AUTO_INCREMENT,
     name VARCHAR(100),
     age INT,
     gender VARCHAR(10),
     contact VARCHAR(15),
     medical_history VARCHAR(255),
     admission_date DATE,
     discharge_date DATE
   );

   CREATE TABLE doctors (
     doctor_id INT PRIMARY KEY AUTO_INCREMENT,
     name VARCHAR(100),
     specialization VARCHAR(100),
     experience INT,
     shift_timing VARCHAR(50)
   );

3. 🧩 Edit DB Credentials (if needed):
   - Open `DBConnection.java`
   - Change `URL`, `USER`, or `PASSWORD` if your MySQL settings are different.

4. ▶️ Run the Project:
   - Open the project in your IDE
   - Compile and run `HospitalManagement.java`
   - Use menu options to add/view patients and doctors

```

---

## 📸 Sample Output

```
Hospital Management System
1. Add Patient
2. View Patients
3. Add Doctor
4. View Doctors
5. Exit
Choose an option: 1
Enter name: Ravi
Enter age: 40
Enter gender: Male
Enter contact: 9999999999
Enter medical history: Diabetes
Enter admission date (YYYY-MM-DD): 2025-06-01
Enter discharge date (YYYY-MM-DD): 2025-06-10
Patient added successfully!
```

---

## 📌 Future Improvements

- Add authentication for admin access
- Export data to CSV or PDF
- GUI using JavaFX or Swing
- Search functionality for doctors/patients

---

## 🙋‍♂️ Author

**Abhishek Saini**  
B.Tech CSE | Intern | Passionate about Java, DBMS, and Real-World Software Projects
