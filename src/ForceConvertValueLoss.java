public class ForceConvertValueLoss {
    public static void main(String[] args) {
        long longVal = 555555555555L;
        int intVal = (int) longVal;
        System.out.println(intVal);

        double doubleVal = 1234567890.123456;
        float floatVal = (float) doubleVal;
        System.out.println(floatVal);
    }
}
