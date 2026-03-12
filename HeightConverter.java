/ Creating HeightConverter class to convert cm to feet and inches
class HeightConverter {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Create a variable for height in cm and take user input
        System.out.print("Enter your height in cm: ");
        double heightCm = input.nextDouble();
        
        // Conversion constants
        double cmPerInch = 2.54;
        int inchesPerFoot = 12;
        
        // Convert total cm to total inches
        double totalInches = heightCm / cmPerInch;
        
        // Calculate feet (integer division)
        int feet = (int) (totalInches / inchesPerFoot);
        
        // Calculate remaining inches using modulus
        double inches = totalInches % inchesPerFoot;
        
        // Display the result
        System.out.println("Your Height in cm is " + heightCm + 
                           " while in feet is " + feet + " and inches is " + inches);
        
        input.close();
    }
}
