# README - SRMS - Student Record Management System

SRMS is a Java CLI Application for Student Record Management. The Student Record Management System is a Java program designed to empower administrators with efficient tools for handling student records. It allows administrators to add new students, update student information, and view student details.

## Instructions for Running the Program

#### 1. Prerequisites:
*Java Development Kit (JDK) installed on your system.
#### 2. Running the Program:
*Compile the Java source file StudentRecordManagementSystem.java.

```bash
javac StudentRecordManagementSystem.java
```
* Run the compiled program
```bash
java StudentRecordManagementSystem
```
## Usage

### 1. Interacting with the Menu
* On program start, a menu will be displayed:
  1. Add a new student
  2. Update student information
  3. View student details
  4. Exit

* Select an Option and follow the prompts.

## Method Descriptions
  1. **main(String[] args)**: Entry point of the program. Displays the administrator interface and handles user input for menu options.

  2. **addNewStudent(Scanner scanner)**: Prompts the user to enter details for a new student and adds the student to the records.

  3. **updateStudent(Scanner scanner)**: Allows the user to update information for an existing student based on their ID.

  4. **viewStudentDetails(Scanner scanner)**: Displays details for a student based on their ID.

  5. **findStudentIndexById(int id)**: Helper method to find the index of a student in the records based on their ID.

## Variables
  1. **totalStudents**: Static variable to store the total number of students.

  2. **studentNames**: Static array to store student names.

  3. **studentIDs**: Static array to store student IDs.

  4. **studentAges**: Static array to store student ages.

  5. **studentGrades**: Static array to store student grades.

## Error Handling
* Proper error handling is implemented to manage cases where the student ID is not found or invalid inputs are provided.

[GitHub Link SRMS](https://github.com/DevenPatel19/SRMS)
