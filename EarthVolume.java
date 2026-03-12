  // Creating EarthVolume class to compute volume in cubic km and cubic miles
class EarthVolume {
    public static void main(String[] args) {
        
        // Create a variable for the radius of earth in km
        double radiusKm = 6378.0;
        
        // Create a variable for PI
        double pi = 3.14159265359;
        
        // Compute volume in cubic kilometers: (4/3) * pi * r^3
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);
        
        // Create conversion factor for km to miles
        double kmToMiles = 0.621371;
        
        // Compute radius in miles
        double radiusMiles = radiusKm * kmToMiles;
        
        // Compute volume in cubic miles
        double volumeMiles3 = (4.0 / 3.0) * pi * Math.pow(radiusMiles, 3);
        
        // Display the result
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + 
                           " and cubic miles is " + volumeMiles3);
    }
}

