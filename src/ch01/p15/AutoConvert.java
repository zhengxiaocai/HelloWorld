package ch01.p15;

public class AutoConvert {

    public static void main(String[] args) {
        int intVal = 99;
        long longVal = intVal;
        long longVal2 = longVal + 1;
        System.out.println(longVal2);

        float floatVal = 11.32F;
        double doubleVal = floatVal;
        double doubleVal2 = floatVal * 2;
        System.out.println(doubleVal);


    }
}
