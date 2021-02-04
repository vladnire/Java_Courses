public class StringBuilderAndStringFormatting {
    public static void main(String[] args) {

        // Inefficient.
        String info = "";
        info += "My name is Bob.";
        info += " ";
        info += "I am a builder";
        System.out.println(info);

        // More efficient.
        StringBuilder sb = new StringBuilder();
        sb.append("My name is Sue.");
        sb.append(" ");
        sb.append("I am a builder");
        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();
        s.append("My name is Roger.")
        .append(" ")
        .append("I am a skydiver");
        System.out.println(s.toString());

        // Formatting
        System.out.println("Here is some text.\tThis was a tab.\nThat was a newline.");
        System.out.println("More text");
        System.out.printf("Total cost %-10d; quantity is %d", 5, 120);
        for(int i=0; i<12; i++){
            System.out.printf("%2d: %s\n", i, "some text here");
        }

        // Formatting floating point values
        System.out.printf("Total value: %.2f\n", 5.6789);
        System.out.printf("Total value: %6.1f\n", 125.6455667);
    }
}
