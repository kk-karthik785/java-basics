 import java.util.Scanner;

// Creating DoubleOpt class to demonstrate operator precedence with double values
class DoubleOpt {
    public static void main(String[] args) {
        // Create Scanner Object to take user input from Standard Input
        Scanner input = new Scanner(System.in);

        // Create variables a, b, and c of double data type and take user input
        System.out.print("Enter value for a: ");
        double a = input.nextDouble();
        
        System.out.print("Enter value for b: ");
        double b = input.nextDouble();
        
        System.out.print("Enter value for c: ");
        double c = input.nextDouble();

        // Compute the results of double operations and assign to variables
        // Operation 1: Multiplication before Addition
        double result1 = a + b * c;
        
        // Operation 2: Multiplication before Addition
        double result2 = a * b + c;
        
        // Operation 3: Division before Addition
        double result3 = c + a / b;
        
        // Operation 4: Modulo before Addition
        double result4 = a % b + c;

        // Display the results of the Double Operations
        System.out.println("The results of Double Operations are " + result1 + ", " + 
                           result2 + ", " + result3 + ", and " + result4);
        
        input.close();
    }
}