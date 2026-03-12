  import java.util.Scanner;

// Creating BasicCalculator class to perform arithmetic operations
class BasicCalculator {
    public static void main(String[] args) {
        // Create Scanner Object to take user input
        Scanner input = new Scanner(System.in);

        // Create variables number1 and number2 and take user inputs
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        // Perform Arithmetic Operations and assign result to variables
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Display the results of all operations
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + 
                           number1 + " and " + number2 + " is " + addition + ", " + subtraction + 
                           ", " + multiplication + ", and " + division);
        
        input.close();
    }
}
