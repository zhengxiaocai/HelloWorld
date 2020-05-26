public class OptNotChangeVariable {
    public static void main(String[] args) {
        /**
         * 除赋值运算外，均不能改变变量的值。
         */
        int a = 100;

        System.out.println(a + 1);

        System.out.println(a);

        a = a + 6;
        System.out.println(a);
    }
}
