package thinkinjava.operators;

public class Equivalence {
    /**
     * Integer 内部维护了一个IntegerCache 默认范围为 [-128, 127]
     */

    public static void main(String[] args) {
        Integer n1 = 47;
        Integer n2 = 47;
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);

        Integer n3 = 128;
        Integer n4 = 128;
        System.out.println(n3 == n4);
        System.out.println(n3 != n4);
    }
}
