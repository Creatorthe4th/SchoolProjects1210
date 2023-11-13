package StudentClass;
// StudentTest class for testing Student objects

public class Studenttest {
    public static void main(String[] args) {
        // Create three Student objects using the parameterized constructor
        Student student1 = new Student("John", "Doe", 12345, "john.doe@example.com", "Computer Science");
        Student student2 = new Student("Jane", "Smith", 67890, "jane.smith@example.com", "Biology");
        Student student3 = new Student("Bob", "Johnson", 54321, "bob.johnson@example.com", "History");

        // Print the information of each student using the toString method
        System.out.println("Student Information: ");
        System.out.println(student1);
        System.out.println("Student Information: ");
        System.out.println(student2);
        System.out.println("Student Information: ");
        System.out.println(student3);

        // Change the email address of one student using the mutator method
        student3.setEmail("bob.johnson@newemail.com");

        // Print the updated information of the student
        System.out.println("Updated Student Information:");
        System.out.println(student3);
    }
}