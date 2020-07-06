package thinkinjava.test00;

public class IntegerCache {

    public static void main(String[] args) {
        Integer i1 = 1;
        Integer i2 = 1;
        System.out.println(i1.equals(i2));
        System.out.println(i1 == i2);

        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3.equals(i4));
        System.out.println(i3 == i4);
    }
}
