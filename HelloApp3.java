public class HelloApp3 {

    public static void main(String[] args) {

        // Default name
        String name = "World";

        // Check if a command-line argument is provided
        if (args.length > 0) {
            name = args[0];
        }

        // Print greeting
        System.out.println("Hello, " + name + "!");
    }
}