package CastingNumericalValues;

public class App {
    public static void main(String[] args) {
        int intValue = 888;
        short shortValue = 12;
        byte byteValue = 20;
        long longValue = 23333;
        float floatValue = 223.0f;
        double doubleValue = 32.4;

        System.out.println(Byte.MAX_VALUE);

        intValue = (int)longValue;
        System.out.println(intValue);
        doubleValue = intValue;
        System.out.println(doubleValue);

        intValue = (int)floatValue;
        System.out.println(floatValue);

        // Won't work as we expect
        // 128 is too big for a byte
        byteValue = (byte)128;
        System.out.println(byteValue);
    }
}
