// Creating AgeCalculator class to find the age based on birth and current year
class AgeCalculator {
    public static void main(String[] args) {
        
        // Create a variable to store the name of the person
        String name = "Harry";
        
        // Create an int variable for birth year
        int birthYear = 2000;
        
        // Create an int variable for the current year
        int currentYear = 2024;
        
        // Calculate the age by subtracting birth year from current year
        int age = currentYear - birthYear;
        
        // Display the result
        System.out.println(name + "'s age in " + currentYear + " is " + age);
    }
}