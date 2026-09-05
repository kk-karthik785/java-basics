public class DuplicateTeamFinder {

    public static String findDuplicateTeam(String[] teamNames) {
        // Outer loop iterates through each team name
        for (int i = 0; i < teamNames.length; i++) {
            // Inner loop compares current team name with all subsequent team names
            for (int j = i + 1; j < teamNames.length; j++) {
                if (teamNames[i].equals(teamNames[j])) {
                    return "Duplicate Found: " + teamNames[i];
                }
            }
        }
        
        return "No Duplicates Found";
    }

    public static void main(String[] args) {
        // Test Case 1
        String[] teams1 = {"ByteForce", "CodeCrafters", "ByteForce"};
        System.out.println(findDuplicateTeam(teams1)); 
        // Output: Duplicate Found: ByteForce

        // Test Case 2
        String[] teams2 = {"ByteForce", "CodeCrafters", "NullPointers"};
        System.out.println(findDuplicateTeam(teams2)); 
        // Output: No Duplicates Found
    }
}