 import java.util.Scanner;

// Creating DistanceConverterInput class to convert user-defined km to miles
class DistanceConverterInput {
    public static void main(String[] args) {
        
        // Create Scanner Object to take user input from Standard Input
        Scanner input = new Scanner(System.in);
        
        // Create variable km and take user input
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();
        
        // Create variable for conversion (1 mile = 1.6 km)
        double milesPerKm = 1.6;
        
        // Calculate miles
        double totalMiles = km / milesPerKm;
        
        // Display the output
        System.out.println("The total miles is " + totalMiles + " mile for the given " + km + " km");
        
        input.close();
    }
}