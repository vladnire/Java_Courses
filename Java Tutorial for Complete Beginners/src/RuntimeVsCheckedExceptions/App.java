package RuntimeVsCheckedExceptions;

public class App {
    public static void main(String[] args) {
        // Checked exception; forced to handle it
        // Thread.sleep(111);

        // Unchecked exception; RuntimeException
        // not forced to handle
        int value = 7;
        try {
            value = value / 0;
        } catch (RuntimeException e){
            System.out.println(e.toString());
        }

        String text = null;
        System.out.println(text.length());

        String[] texts = {"one", "two", "three"};
        System.out.println(texts[3]);
    }
}
