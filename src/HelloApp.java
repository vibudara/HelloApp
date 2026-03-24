public class HelloApp {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        }
        else if (args.length == 1) {
            System.out.println("Hello, " + args[0] + "!");
        }
        else {
            System.out.print("Hello, ");

            for (int i = 0; i < args.length; i++) {

                if (i == args.length - 1) {
                    System.out.print("and " + args[i]);
                } else {
                    System.out.print(args[i]);

                    if (i < args.length - 2) {
                        System.out.print(", ");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println("!");
        }
    }
}