package oop.com.second59;

public class DiscountMgrStaticMethod {

    public static void main(String[] args) {
        DiscountMgrStaticMethod d = new DiscountMgrStaticMethod();
    }

    public static double BASE_DISCOUNT;

    // >> TODO: 使用静态变量的静态代码块，必须声明在静态变量后边。
    static {
        BASE_DISCOUNT = 0.9;
        System.out.println("静态代码块1，BASE_DISCOUNT为 " + BASE_DISCOUNT);
    }

    static {
        BASE_DISCOUNT = 0.8;
        System.out.println("静态代码块1，BASE_DISCOUNT为 " + BASE_DISCOUNT);
    }
}
