 import java.util.Scanner;

// Creating SquareSideFinder class to calculate side length from perimeter
class SquareSideFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create a variable perimeter and take user input
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Create a variable side to calculate the length (Perimeter = 4 * side)
        double side = perimeter / 4;

        // Display the length of the side and the perimeter
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        
        input.close();
    }
}
