# Design Patterns Demonstration [TASK 1]

## Overview
This project demonstrates the implementation of six different software design patterns. The patterns are categorized into three main types:

- **Behavioral Design Patterns**
  - Two use cases demonstrating behavioral design patterns.

- **Creational Design Patterns**
  - Two use cases demonstrating creational design patterns.

- **Structural Design Patterns**
  - Two use cases demonstrating structural design patterns.

###  Compile the Code
Compile all the Java files using:
```bash
javac *.java
```

### Run the Applications
You can run each use case by executing the corresponding main class:
```bash
java UseCase1
java UseCase2
java UseCase3
java UseCase4
java UseCase5
java UseCase6
```
_________________________________________________________________________________________________________________________________________________________________________


# Virtual Classroom Manager  [TASK 2]

## Overview
The Virtual Classroom Manager is a console-based application designed to manage virtual classrooms, including class scheduling, student enrollment, and assignment submissions. The application utilizes OOP principles and Java's logging capabilities to ensure code quality and maintainability.

## Features
- Add and manage classrooms.
- Enroll students in classrooms.
- Schedule assignments for classrooms.
- Submit assignments by students.
- Logging for tracking events and errors.

## Prerequisites
- Java Development Kit (JDK) 8 or higher.
- A terminal or command prompt.

## Getting Started

### 1. Clone the Repository
If you have Git installed, you can clone the repository using the following command:
```bash
git clone <repository_url>
```

### 2. Navigate to the Project Directory
Change to the project directory:
```bash
cd <project_directory>
```

### 3. Compile the Code
Compile the Java files using the following command:
```bash
javac Main.java
```

### 4. Run the Application
Start the application with the following command:
```bash
java Main
```

## Usage

### Commands
The application accepts the following commands:

- **Add Classroom**
  - **Command:** `add_classroom <class_name>`
  - **Example:** `add_classroom Math101`
  - **Output:** `Classroom Math101 has been created.`

- **Add Student**
  - **Command:** `add_student <student_id> <class_name>`
  - **Example:** `add_student S001 Math101`
  - **Output:** `Student S001 has been enrolled in Math101.`

- **Schedule Assignment**
  - **Command:** `schedule_assignment <class_name> <assignment>`
  - **Example:** `schedule_assignment Math101 Assignment1`
  - **Output:** `Assignment for Math101 has been scheduled.`

- **Submit Assignment**
  - **Command:** `submit_assignment <student_id> <class_name> <assignment>`
  - **Example:** `submit_assignment S001 Math101 Assignment1`
  - **Output:** `Assignment submitted by Student S001 in Math101.`

- **Exit Application**
  - **Command:** `exit`
  - **Output:** `Exiting application.`

### Error Handling
If an invalid command is entered or if there are issues with inputs, the application will display error messages as follows:
- **Invalid command:** `Invalid command. Please try again.`
- **Argument errors:** Usage messages will specify the correct command format.

## Example Session
```
Enter command: add_classroom Math101
Classroom Math101 has been created.
Enter command: add_student S001 Math101
Student S001 has been enrolled in Math101.
Enter command: schedule_assignment Math101 Assignment1
Assignment for Math101 has been scheduled.
Enter command: submit_assignment S001 Math101 Assignment1
Assignment submitted by Student S001 in Math101.
Enter command: exit
Exiting application.
```
