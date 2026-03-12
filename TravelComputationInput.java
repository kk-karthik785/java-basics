 import java.util.Scanner;

// Creating TravelComputationInput class to compute travel details via user input
class TravelComputationInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create variables and take user inputs for name and cities
        System.out.print("Enter Name: ");
        String name = input.next();

        System.out.print("Enter Starting City: ");
        String fromCity = input.next();

        System.out.print("Enter Destination City: ");
        String toCity = input.next();

        // Travel details
        System.out.print("Enter Distance (in km): ");
        double distance = input.nextDouble();

        System.out.print("Enter Speed (km per hour): ");
        double speed = input.nextDouble();

        System.out.print("Enter Cost per km: ");
        double costPerKm = input.nextDouble();

        // Calculations
        double travelTime = distance / speed;
        double totalCost = distance * costPerKm;

        // Display results
        System.out.println("\n--- Travel Details ---");
        System.out.println("Name: " + name);
        System.out.println("From: " + fromCity);
        System.out.println("To: " + toCity);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Estimated Travel Time: " + travelTime + " hours");
        System.out.println("Total Travel Cost: " + totalCost);
        
        input.close();
    }
}