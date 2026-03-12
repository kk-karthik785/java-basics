 import java.util.Scanner;

// Creating TriangleArea class to compute area in cm and inches
class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create variables for base and height and take user input in cm
        System.out.print("Enter base in cm: ");
        double baseCm = input.nextDouble();
        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();

        // Calculate area in square cm: 1/2 * base * height
        double areaSqCm = 0.5 * baseCm * heightCm;

        // Convert base and height to inches (1 in = 2.54 cm)
        double baseInches = baseCm / 2.54;
        double heightInches = heightCm / 2.54;

        // Calculate area in square inches
        double areaSqInches = 0.5 * baseInches * heightInches;

        // Display the results
        System.out.println("The Area of the triangle in sq in is " + areaSqInches + 
                           " and sq cm is " + areaSqCm);
        
        input.close();
    }
}
