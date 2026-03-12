import java.util.Scanner;

// Creating DivisionCalculator class to find quotient and remainder
class DivisionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create variables number1 and number2 and take user input
        System.out.print("Enter the dividend (number1): ");
        int number1 = input.nextInt();
        System.out.print("Enter the divisor (number2): ");
        int number2 = input.nextInt();

        // Calculate quotient using division operator (/)
        int quotient = number1 / number2;

        // Calculate remainder using moduli operator (%)
        int remainder = number1 % number2;

        // Display the results
        System.out.println("The Quotient is " + quotient + " and Reminder is " + 
                           remainder + " of two number " + number1 + " and " + number2);
        
        input.close();
    }
}
