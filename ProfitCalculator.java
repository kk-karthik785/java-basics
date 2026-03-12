 // Creating ProfitCalculator class to compute profit amount and percentage
class ProfitCalculator {
    public static void main(String[] args) {
        
        // Create variables for cost price and selling price
        double costPrice = 129.0;
        double sellingPrice = 191.0;
        
        // Calculate the profit amount
        double profit = sellingPrice - costPrice;
        
        // Calculate the profit percentage
        double profitPercentage = (profit / costPrice) * 100;
        
        // Display result using a single print statement for multiline output
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + 
                           "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
    }
}
