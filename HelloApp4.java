public class HelloApp4 {

    public static void main(String[] args) {

        // If no arguments provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        else {

            // Build string with all names
            StringBuilder names = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                names.append(args[i]);

                if (i < args.length - 1) {
                    names.append(", ");
                }
            }

            System.out.println("Hello, " + names + "!");
        }
    }
}