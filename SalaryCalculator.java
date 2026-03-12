import java.util.Scanner;

// Creating SalaryCalculator class to find total income
class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create a variable named salary and take user input
        System.out.print("Enter Salary: ");
        double salary = input.nextDouble();

        // Create another variable bonus and take user input
        System.out.print("Enter Bonus: ");
        double bonus = input.nextDouble();

        // Compute income by adding salary and bonus
        double totalIncome = salary + bonus;

        // Display the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + 
                           bonus + ". Hence Total Income is INR " + totalIncome);
        
        input.close();
    }
}
