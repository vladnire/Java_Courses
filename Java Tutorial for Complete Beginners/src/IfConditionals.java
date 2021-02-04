public class IfConditionals {
    public static void main(String[] args) {

        int myInt = 20;

        if(myInt < 10){
            System.out.println("Yes, it is true!");
        }
        else if (myInt == 10){
            System.out.println("Second condition is true!");
        }
        else{
            System.out.println("No, it is false!");
        }

        int loop = 0;

        while (true){
            System.out.println("Looping: " + loop);

            if (loop == 4) {
                break;
            }
            loop++;
            System.out.println("Running: ");
        }
    }
}
