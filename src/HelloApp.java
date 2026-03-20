public class HelloApp {

    public static void main(String[] args) {

        // Check if user provided a name
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        }
        // Default case
        else {
            System.out.println("Hello, World!");
        }

    }
}