package ch01.p15;

public class ForceConvert {

    public static void main(String[] args) {
        int intVal = 99;
        long longVal = 19999;
        intVal = (int) longVal;

        float floatVal;
        double doubleVal = 334455.66;
        floatVal = (float) doubleVal;

        int a = 65;
        char b = (char) a;
        System.out.println(b);
    }
}
