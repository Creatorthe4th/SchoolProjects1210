import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<String> studentList;

    public StudentManager() {
        this.studentList = new ArrayList<>();
    }

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // consume the invalid input
            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    displayStudentList();
                    break;
                case 3:
                    System.out.println("Exiting Student Manager. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 3);

        scanner.close();
    }

    private void displayMenu() {
        System.out.println("Student Manager Menu:");
        System.out.println("1. Add Student");
        System.out.println("2. Display Student List");
        System.out.println("3. Exit");
    }

    private void addStudent(Scanner scanner) {
        System.out.print("Enter the student's name: ");
        String studentName = scanner.next();
        studentList.add(studentName);
        System.out.println(studentName + " has been added to the student list.\n");
    }

    private void displayStudentList() {
        System.out.println("Student List:");
        for (String student : studentList) {
            System.out.println(student);
        }
        System.out.println();
    }
}
