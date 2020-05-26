public class StringConcat {
    public static void main(String[] args) {
        /**
         * 字符串拼接 + ：
         * 可以跟任何类型相加，最后都是String
         * 可以用 +=
         * 符合运算符的优先级
         *
         * String 类型不是基本数据类型
         * String 非保留字
         *
         * String 的加法不会改变原String的值。
         */
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("a + b = " + c);

        boolean aBigThanB = a > b;
        System.out.println("a > b 是 " + aBigThanB + " 的。");

        System.out.println("a + b = " + a + b);

        System.out.println("a + b = " + (a + b));

        System.out.println("a * b = " + a * b);

        int String = 10;
        System.out.println(String);
    }
}
