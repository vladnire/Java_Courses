package Lambdas;

interface Executable{
    int execute(int a, int b);
}

interface StringExecutable{
    int execute(String a);
}

class Runner{
    public void run(Executable e){
        System.out.println("Executing code block...");
        int value = e.execute(12, -3);
        System.out.println("Return value is " + value);
    }

    /*
    public void run(StringExecutable e){
        System.out.println("Executing code block...");
        int value = e.execute("shit");
        System.out.println("Return value is " + value);
    }

     */
}

/*
    Valid Lambda expressions
    () -> System.out.println("Hello there.");
    () -> {
            System.out.println("Code passed in Lambda expression");
            System.out.println("Hello there.");
        }
    () -> {
            System.out.println("Code passed in Lambda expression");
            System.out.println("Hello there.");
            return 8;
        }
    () -> {
        return 8;
      }
    () -> 8
    (int a) -> 8
    (int a) -> {
            System.out.println("Hello there.");
            return a + 8;
        }
    (a) -> {
            System.out.println("Hello there.");
            return a + 8;
        }
    a -> {
            System.out.println("Hello there.");
            return a + 8;
        }
    (a, b) -> {
            System.out.println("Hello there.");
            return a + 8;
        }
 */


public class App {
    public static void main(String[] args) {
        int c = 100;
        // Must not do this: c= 8;

        int d = 7;

        Runner runner = new Runner();
        runner.run(new Executable() {
            public int execute(int a, int b) {
                System.out.println("Hello there.");
                // Can't do this in methods of anonymous classses: int d = 8;
                return c + a + b;
            }
        });

        System.out.println("------------------------");

        // Do everything from abode with Lambdas; pass a block to execute
        runner.run((a, b) -> {
            System.out.println("Hello there.");
            // Can't do this, no new scope: int d = 99;
            return a + b + c;
        });

        System.out.println("------------------------");

        Executable ex = (a, b) -> {
            System.out.println("Hello there.");
            // Can't do this, no new scope: int d = 99;
            return a + b + c;
        };
        runner.run(ex);

        Object codeBlock = (Executable)(a, b) -> {
            System.out.println("Hello there.");
            // Can't do this, no new scope: int d = 99;
            return a + b + c;
        };
    }
}
