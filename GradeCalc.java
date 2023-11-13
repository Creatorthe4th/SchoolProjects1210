package GradeCalc;
public class GradeCalc {
    //declaring private variables to be used
    private String name;
    private double[] scores;
    //declaring a void setName
    public void setName(String name) {
        this.name = name;
    }
    //setting scores
    public void setScores(double[] scores) {
        this.scores = scores;
    }
    //getting the name method
    public String getName() {
        return name;
    }
    
    public double[] getScores() {
        return scores;
    }

    public double calculateAverageScore() {
        if (scores == null || scores.length == 0) {
            return 0.0; // Return 0 if there are no scores.
        }
        
        double sum = 0.0;
        for (double score : scores) {
            sum += score;
        }

        return sum / scores.length;
    }

    public static void main(String[] args) {
        GradeCalc student = new GradeCalc();

        // Set the student's name and scores using mutator methods.
        student.setName("Lebron James");
        double[] scores = {90.5, 85.0, 78.5, 92.0, 88.5};
        student.setScores(scores);

        // Retrieve the name and scores using accessor methods.
        String studentName = student.getName();
        double[] studentScores = student.getScores();

        // Calculate and display the average score.
        double averageScore = student.calculateAverageScore();

        // Display the results.
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Scores: " + java.util.Arrays.toString(studentScores));
        System.out.println(studentName + "'s Average Score: " + averageScore);
    }
}
