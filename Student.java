package StudentClass;
    // Student class with attributes and methods
class Student {
    private String firstName;
    private String lastName;
    private int studentId;
    private String email;
    private String major;

    // Parameterized constructor to set the values of attributes
    public Student(String firstName, String lastName, int studentId, String email, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.email = email;
        this.major = major;
    }

    // Accessor methods to retrieve attribute values
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getEmail() {
        return email;
    }

    public String getMajor() {
        return major;
    }

    // Mutator method to change the email address
    public void setEmail(String newEmail) {
        email = newEmail;
    }

    // toString method to return a string representation of the Student object
    
    public String toString() {
        return  "Full Name: " + firstName + " " + lastName + "\n" +
                "Student ID: " + studentId + "\n" +
                "Email: " + email + "\n" +
                "Major: " + major + "\n";
    }
}
