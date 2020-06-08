package ch01.p10;

public class MathCalc {

    public static void main(String[] args) {
        System.out.println("5+6");
        System.out.println(5 + 6);
        System.out.println(5 - 6);
        System.out.println(5 * 6);

        // 正儿八经的除法，被除数、除数需要至少一个是浮点型
        System.out.println(5 / 6.0);

        // 优先级跟正常的是数学运算是一样的。
        System.out.println((1 + 2) * 3);
    }
}
