# Student Record Management System


## Introduction
This is a simple **Student Record Management System** implemented in Java. It allows users to manage student records by performing operations such as adding, viewing, updating, and deleting student data. The program uses an `ArrayList` to store student records and provides a menu-driven interface for user interaction.

---

## Features
- **Add Student**: Add a new student record with ID, name, and marks.
- **View Students**: Display all student records stored in the system.
- **Update Student**: Update the name and marks of an existing student using their ID.
- **Delete Student**: Remove a student record from the system using their ID.
- **Exit**: Exit the application gracefully.

---

## Prerequisites
To run this program, you need:
- **Java Development Kit (JDK)** installed on your system (version 8 or higher).
- A text editor or IDE (e.g., IntelliJ IDEA, Eclipse, VS Code) to view and edit the code.
- Basic knowledge of Java programming.

---

## How to Run the Program
1. **Clone or Download the Code**:
   - Clone this repository or download the source files (`StudentManagement.java` and `Student.java`) to your local machine.

2. **Compile the Code**:
   - Open a terminal or command prompt.
   - Navigate to the directory containing the source files.
   - Compile the Java files using the following command:
     ```bash
     javac task2/StudentManagement.java task2/Student.java
     ```

3. **Run the Program**:
   - Execute the compiled program using the following command:
     ```bash
     java task2.StudentManagement
     ```

4. **Interact with the Menu**:
   - Follow the on-screen instructions to perform various operations on student records.

---

## Code Structure
The project consists of two main classes:
1. **`StudentManagement`**:
   - Contains the main logic for managing student records.
   - Provides methods for adding, viewing, updating, and deleting students.
   - Implements a menu-driven interface for user interaction.

2. **`Student`**:
   - Represents a student entity with attributes: `id`, `name`, and `marks`.
   - Includes constructors, getters, setters, and a `toString()` method for displaying student details.

---

## Usage Instructions
### Main Menu Options
When you run the program, you will see the following menu:

```
--- Student Record Management ---
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter your choice:
```

#### 1. Add Student
- Enter the student's ID, name, and marks when prompted.
- Example:
  ```
  Enter Student ID: 1
  Enter Student Name: John Doe
  Enter Student Marks: 85.5
  Student added successfully!
  ```

#### 2. View Students
- Displays all students currently stored in the system.
- Example:
  ```
  --- Student Records ---
  ID: 1, Name: John Doe, Marks: 85.5
  ID: 2, Name: Jane Smith, Marks: 90.0
  ```

#### 3. Update Student
- Enter the ID of the student you want to update.
- Provide the new name and marks for the student.
- Example:
  ```
  Enter Student ID to update: 1
  Enter new name: Johnathan Doe
  Enter new marks: 88.0
  Student updated successfully!
  ```

#### 4. Delete Student
- Enter the ID of the student you want to delete.
- Example:
  ```
  Enter Student ID to delete: 2
  Student deleted successfully!
  ```

#### 5. Exit
- Exits the program with a goodbye message:
  ```
  Exiting the system. Goodbye!
  ```

