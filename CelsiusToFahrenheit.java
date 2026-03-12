import java.util.Scanner;

// Creating CelsiusToFahrenheit class to convert temperature units
class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create a celsius variable and take the temperature as user input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Use the Formula Celsius to Fahrenheit: (C * 9/5) + 32 = F 
        // and assign to fahrenheitResult
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Display the result
        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");
        
        input.close();
    }
}