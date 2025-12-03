# Student Management System 

A simple **console-based Student Management System** written in Java.  
It allows you to add student details and view the list of students during the program runtime using an in-memory `ArrayList`.

## 📌 Features ::

- Add a new student with:
  - Student ID
  - Name
  - Age
- View all added students in a formatted list
- Input validation for menu choices (basic)
- Simple and beginner-friendly code structure


# 🛠️ Technologies Used

- **Language:** Java  
- **Concepts:** Classes & Objects, Constructors, ArrayList, Loops, Scanner (user input), `toString()` method.

## 📂 Project Structure ::


- `Student` class  
  - Holds `id`, `name`, and `age`  
  - Overrides `toString()` to display student details

- `student_management` class  
  - Contains the `main` method  
  - Displays a menu and handles user choices  
  - Stores students in an `ArrayList<Student>`
 
- 📋 Sample Menu ::

- ===== STUDENT MANAGEMENT SYSTEM =====
1. Add Student
2. View Students
3. Exit
Enter choice:


💡 Future Improvements

-> Edit and delete existing students

-> Save data to a file or database

-> Add validation for duplicate IDs

-> Create a GUI or web-based version
