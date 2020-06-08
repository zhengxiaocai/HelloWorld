package ch01.p17;

public class IncreaseDecrease {

    public static void main(String[] args) {
        /**
         * a-- a++
         * 第一次出现的时候，还是原来的值
         */
        int a = 1;
        System.out.println("a++=" + a++);
        System.out.println(a);

        a=1;
        System.out.println("++a=" + ++a);
        System.out.println(a);

        int b = 10;
        System.out.println("b--=" + b--);
        System.out.println(b);

        b = 10;
        System.out.println("--b=" + --b);
        System.out.println(b);
    }
}
