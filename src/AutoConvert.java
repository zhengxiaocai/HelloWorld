public class AutoConvert {
    public static void main(String[] args) {
        /**
         * 自动类型转换，低精度向高精度转换。
         * 赋值或者运算的时候。
         * 8double>4float>8long>4int>2short>1byte
         *
         * 2char 为啥自动转换成 2short呢？
         * 因为，2char是无符号数，值域超过short了，所以，不能转换。
         */
        int intVal = 99;
        long longVal = intVal;
        long longVal2 = intVal + 1;
        System.out.println(longVal2);

        float floatVal = 11.32f;
        double doubleVal = floatVal;
        double doubleVal2 = floatVal * 2;
        System.out.println(doubleVal2);

        doubleVal = longVal;
        doubleVal = intVal;

        char ch = 'A';
        int chNum = ch;
        int chNumCalc = ch + 10;
        System.out.println(ch);
        System.out.println(chNum);
    }
}
