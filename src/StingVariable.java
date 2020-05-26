public class StingVariable {
    public static void main(String[] args) {
        /**
         * String 的拼接计算，不会改变变量本身。
         */
        int a = 10;
        String str = "a的值是：";
        str = str + a;
        System.out.println(str);

        String s2 = "a的值是：";
        System.out.println(s2 + a);
        System.out.println(s2);
    }
}
