package thinkinjava.operators;

public class OverFlow {
    // >>TODO: 溢出  Integer.MAX_VALUE
    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println("big : " + big);

        int bigger = big * 4;
        System.out.println("bigger : " + bigger);
    }
}
