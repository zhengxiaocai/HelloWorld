public class BaseTypes {
    public static void main(String[] args) {
        // byte -128 ～ 127
        byte byteVar = -128;
        System.out.println("byte: " + byteVar);

        // short -2^15 ~ 2^15 - 1 大约3w多
        double shortLine = Math.pow(2, 15);
        System.out.println(shortLine);
        short shortVar = 30000;
        System.out.println(shortVar);

        // System.out.println()  快捷键  sout

        // int -2^31 ~ 2^31 - 1 20+亿
        int intVar = 300000;
        System.out.println(intVar);

        // long -2^64 ~ 2^64 - 1
        long longVar = 3000000L;
        System.out.println(longVar);
        long bigLongVar = 99999999999L;
        System.out.println(bigLongVar);

        // float
        float floatVar = 100.000001F;
        System.out.println(floatVar);

        // double
        double doubleVar = 100.000001;
        System.out.println(doubleVar);

        // boolean
        boolean condition = true;
        boolean fcondition = false;
        System.out.println(condition);
        System.out.println(fcondition);
    }
}
