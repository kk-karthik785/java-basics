  import java.util.Scanner;

// Creating FahrenheitToCelsius class to convert temperature units
class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create a fahrenheit variable and take the user's input
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // User the formulae to convert Fahrenheit to Celsius: (F - 32) * 5/9 = C 
        // and assign the result to celsiusResult
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Display the result
        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");
        
        input.close();
    }
}

