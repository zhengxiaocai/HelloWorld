public class ForceConvert {
    public static void main(String[] args) {
        /**
         * 强制类型转换：
         * int intVal = (int) longVal;
         * float floatVal = (float) doubleVal;
         *
         * ASCII码互转：
         * int intVal = ch;
         * char ch = (char) intVal;
         */
        int intVal;
        long longVal = 19999;
        intVal = (int) longVal;
        System.out.println(intVal);

        double doubleVal = 3344556.789;
        System.out.println(doubleVal);
        float floatVal = (float) doubleVal;
        System.out.println(floatVal);

        char ch = 'A';
        intVal = ch;
        char ch2 = (char) (intVal + 1);
        System.out.println(intVal);
        System.out.println(ch2);
    }
}
