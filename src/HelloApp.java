public class HelloApp {
    public static void main(String[] args) {
        String name = "World";

        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;
            for (String arg : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(arg);
                first = false;
            }
            name = nameBuilder.toString();
        }
        System.out.println("Hello, " + name + "!");
    }
}