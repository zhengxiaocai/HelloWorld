public class IncreaseDecrease {
    public static void main(String[] args) {
        /**
         * a-- a++
         * 先执行，后运算。执行当前语句还没有计算，当前语句执行之后才计算生效。
         * --a ++a
         * 先运算，再执行。执行当前语句的时候已经计算。
         */
        int a = 1;
        System.out.println("a++=" + a++);
        System.out.println("a=" + a);
        a = 1;
        System.out.println("++a=" + ++a);
        System.out.println("a=" + a);

        int b = 10;
        System.out.println("b--=" + b--);
        System.out.println("b="+ b);
        b = 10;
        System.out.println("++b=" + ++b);
        System.out.println("b=" + b);
    }
}
