import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return id + " - " + name + " - " + age;
    }
}

public class student_management {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter Student ID: ");
                int id = sc.nextInt();
                sc.nextLine(); // clear buffer

                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Student Age: ");
                int age = sc.nextInt();

                students.add(new Student(id, name, age));
                System.out.println("✔ Student Added!");
            }

            else if (choice == 2) {
                System.out.println("\n--- Student List ---");
                if (students.isEmpty()) {
                    System.out.println("No students found.");
                } else {
                    for (Student s : students) {
                        System.out.println(s);
                    }
                }
            }

            else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            }

            else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}
