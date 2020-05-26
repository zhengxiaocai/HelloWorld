public class FloatCalc {
    public static void main(String[] args) {
        /**
         * 整形：
         *      byte    1byte
         *      short   2byte
         *      int     4byte   default
         *      long    8byte
         * 浮点型：
         *      float   4byte
         *      double  8byte   default
         * 布尔型：
         *      boolean 1byte   true false
         * 字符型：
         *      char    2byte   所有字符
         */
        float a = 1 / 3L;
        System.out.println(a);

        double b = 1 / 3.0;
        System.out.println(b);

        System.out.println(1 > 3);
        System.out.println(1 < 3);

        System.out.println("AAA");
        System.out.println('A');
    }
}
