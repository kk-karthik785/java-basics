  import java.util.Scanner;

// Creating DistanceConverter class to convert feet to yards and miles
class Distanceconverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create a variable distanceInFeet and take user input
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Create variables for conversion factors (3 feet = 1 yard, 1760 yards = 1 mile)
        double feetPerYard = 3.0;
        double yardsPerMile = 1760.0;

        // Calculate distance in yards
        double distanceInYards = distanceInFeet / feetPerYard;

        // Calculate distance in miles
        double distanceInMiles = distanceInYards / yardsPerMile;

        // Display the distance in yards and miles
        System.out.println("The distance in yards is " + distanceInYards + 
                           " while the distance in miles is " + distanceInMiles);
        
        input.close();
    }
}
