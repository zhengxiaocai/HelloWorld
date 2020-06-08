package ch01.p13;

public class BooleanOprt {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println(a && b);
        System.out.println(a & b);
        System.out.println(a || b);
        System.out.println(a | b);

        System.out.println(a || (10 / 0 > 0));
        System.out.println(a | (10 / 0 > 0));
    }
}
