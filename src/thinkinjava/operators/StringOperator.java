package thinkinjava.operators;

public class StringOperator {

    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z";
        System.out.println(s + x + y + z);
        System.out.println(x + " " + s);
        s += "(summed) = ";
        System.out.println(s + (x + y + z));
        // >>TODO:Integer.toString()方法简写
        System.out.println("" + x);

        boolean b;
        while (b = true){

        }
    }
}
