package thinkinjava.operators;

public class Underscores {

    public static void main(String[] args) {
        double d = 341_567;
        System.out.println(d);

        int bin = 0b0010_1111_1010_1111_1010_1111_1010_1111;
        System.out.println(Integer.toBinaryString(bin));
        System.out.printf("%x%n", bin);     // 转化进制输出
    }
}
