/ Creating DistanceConverter class to convert km to miles
class DistanceConverter {
    public static void main(String[] args) {
        
        // Create a variable for distance in kilometers
        double distanceInKm = 10.8;
        
        // Create a variable for the conversion factor
        double kmToMilesFactor = 1.6;
        
        // Calculate distance in miles
        double distanceInMiles = distanceInKm / kmToMilesFactor;
        
        // Display the result
        System.out.println("The distance " + distanceInKm + " km in miles is " + distanceInMiles);
    }
}