  import java.util.Scanner;

// Creating IntOperation class to demonstrate operator precedence
class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create variables a, b, and c of int data type and take user input
        System.out.print("Enter value for a: ");
        int a = input.nextInt();
        System.out.print("Enter value for b: ");
        int b = input.nextInt();
        System.out.print("Enter value for c: ");
        int c = input.nextInt();

        // Compute integer operations and assign results to variables
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        // Display the results of the operations
        System.out.println("The results of Int Operations are " + result1 + ", " + 
                           result2 + ", " + result3 + ", and " + result4);
        
        input.close();
    }
}
