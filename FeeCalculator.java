 // Creating FeeCalculator class to compute discount and final payable fee
class FeeCalculator {
    public static void main(String[] args) {
        
        // Create a variable named fee and assign 125000 to it
        double fee = 125000.0;
        
        // Create another variable discountPercent and assign 10 to it
        double discountPercent = 10.0;
        
        // Compute discount and assign it to the discount variable
        double discount = (fee * discountPercent) / 100.0;
        
        // Compute the fee you have to pay by subtracting the discount from the fee
        double finalFee = fee - discount;
        
        // Display the results
        System.out.println("The discount amount is INR " + discount + 
                           " and final discounted fee is INR " + finalFee);
    }
}
