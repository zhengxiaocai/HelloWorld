package thinkinjava.operators;

public class EqualsMethod {
    /**
     * 以下调用的是Integer重写的equals()方法，比较的是值。
     */

    public static void main(String[] args) {
        Integer n1 = 247;
        Integer n2 = 247;
        System.out.println(n1.equals(n2)); // true
    }
}
