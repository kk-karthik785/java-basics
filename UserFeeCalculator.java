 import java.util.Scanner;

// Creating UserFeeCalculator class to compute discount based on user input
class UserFeeCalculator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Create a variable named fee and take user input
        System.out.print("Enter the student fee: ");
        double fee = input.nextDouble();
        
        // Create another variable discountPercent and take user input
        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();
        
        // Compute discount and assign it to the discount variable
        double discount = (fee * discountPercent) / 100.0;
        
        // Compute the final fee to pay
        double finalFee = fee - discount;
        
        // Display the results
        System.out.println("The discount amount is INR " + discount + 
                           " and final discounted fee is INR " + finalFee);
        
        input.close();
    }
}
