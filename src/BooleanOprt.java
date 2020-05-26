public class BooleanOprt {
    public static void main(String[] args) {
        /**
         * & 都为true才是true
         * | 一个true就是true
         *
         * 短路：
         *      &&  第一个为false，后边就不用看了；
         *      ||  第一个为true，后边就不用看了。
         */
        boolean a = true;
        boolean b = false;

        System.out.println(a && b);
        System.out.println(a & b);
        System.out.println(a || b);
        System.out.println(a | b);

        System.out.println(a || (10 / 0 > 1));
//        System.out.println(a | (10 / 0 > 1));
    }
}
