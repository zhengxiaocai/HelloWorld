package thinkinjava.operators;

public class Precedence {

    public static void main(String[] args) {
        //>>TODO: 同类型变量一起赋值。
        int x = 1, y = 2, z = 3;
        int a = x + y - 2 / 2 + z;
        int b = x + (y - 2) / (2 + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
