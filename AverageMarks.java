 // Creating AverageMarks class to compute the average of PCM scores
class AverageMarks {
    public static void main(String[] args) {
        
        // Create variables for individual subject marks
        int mathsMarks = 94;
        int physicsMarks = 95;
        int chemistryMarks = 96;
        
        // Create a variable to store the number of subjects
        int numberOfSubjects = 3;
        
        // Calculate total marks
        int totalMarks = mathsMarks + physicsMarks + chemistryMarks;
        
        // Calculate average mark
        double averageMark = (double) totalMarks / numberOfSubjects;
        
        // Display the result
        System.out.println("Sam's average mark in PCM is " + averageMark);
    }
}