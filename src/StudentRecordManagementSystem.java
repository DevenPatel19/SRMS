import java.util.Scanner;

public class StudentRecordManagementSystem {
    private static int totalStudents = 0;
    private static String[] studentNames = new String[100];
    private static int[] studentIDs = new int[100];
    private static int[] studentAges = new int[100];
    private static char[] studentGrades = new char[100];
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
            System.out.println("Student Record Management System");
            System.out.println("1. Add a new student");
            System.out.println("2. Update student information");
            System.out.println("3. View student details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            // Main menu loop
            switch (choice) {
                case 1:
                    addNewStudent(scanner);
                    break;
                case 2:
                    updateStudent(scanner);
                    break;
                case 3:
                    viewStudentDetails(scanner);
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
        scanner.close();
    }
    
    private static void addNewStudent(Scanner scanner) {
        System.out.print("Enter student name: ");
        String name = scanner.next();
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        System.out.print("Enter student grade: ");
        char grade = scanner.next().charAt(0);
        
        // Store student information in arrays
        studentNames[totalStudents] = name;
        studentIDs[totalStudents] = id;
        studentAges[totalStudents] = age;
        studentGrades[totalStudents] = grade;
        
        totalStudents++; // Increment total students count
        
        System.out.println("Student added successfully.");
    }
    
    private static void updateStudent(Scanner scanner) {
        System.out.print("Enter student ID to update: ");
        int id = scanner.nextInt();
        
        int index = findStudentIndexById(id);  // Find student index
        if (index == -1) {
            System.out.println("Student ID not found.");
            return;
        }
        
        // Prompt user for new information
        System.out.println("Enter new information for student with ID " + id);
        System.out.print("Enter student name: ");
        String name = scanner.next();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        System.out.print("Enter student grade: ");
        char grade = scanner.next().charAt(0);
        
        // Update student information in arrays
        studentNames[index] = name;
        studentAges[index] = age;
        studentGrades[index] = grade;
        
        System.out.println("Student information updated successfully.");
    }
    
    private static void viewStudentDetails(Scanner scanner) {
        System.out.print("Enter student ID to view details: ");
        int id = scanner.nextInt();
        
        int index = findStudentIndexById(id); // Find student index
        if (index == -1) {
            System.out.println("Student ID not found.");
            return;
        }
        
     // Display student details
        System.out.println("Student Details:");
        System.out.println("Name: " + studentNames[index]);
        System.out.println("ID: " + studentIDs[index]);
        System.out.println("Age: " + studentAges[index]);
        System.out.println("Grade: " + studentGrades[index]);
    }
    
    private static int findStudentIndexById(int id) {
    	// Loop through students to find matching ID
        for (int i = 0; i < totalStudents; i++) {
            if (studentIDs[i] == id) {
                return i; // Return index if found
            }
        }
        return -1; // Return -1 if ID not found
    }
}