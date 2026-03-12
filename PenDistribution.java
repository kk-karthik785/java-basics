 // Creating PenDistribution class to find pens per student and remaining pens
class PenDistribution {
    public static void main(String[] args) {
        
        // Create variables for total pens and total students
        int totalPens = 14;
        int totalStudents = 3;
        
        // Calculate pens per student using division operator
        int pensPerStudent = totalPens / totalStudents;
        
        // Calculate remaining pens using modulus operator
        int remainingPens = totalPens % totalStudents;
        
        // Display the result
        System.out.println("The Pen Per Student is " + pensPerStudent + 
                           " and the remaining pen not distributed is " + remainingPens);
    }
}