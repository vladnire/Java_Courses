package Recursion;

public class App {
    public static void main(String[] args) {
        // Eg: 4 factorial 4! = 4 * 3 * 2 * 1
        System.out.println(factorial(4));
    }

    private static int factorial(int value){
        if (value == 1){
            return 1;
        }
        return factorial(value - 1) * value;
    }
}
