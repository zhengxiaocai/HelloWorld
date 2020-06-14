package thinkinjava.operators;

import java.util.Random;

public class Bool {

    public static void main(String[] args) {
        Random random = new Random(47);
        int i = random.nextInt(100);
        int j = random.nextInt(100);
        System.out.println("i : " + i);
        System.out.println("j : " + j);
        System.out.println("i > j is " + (i > j));
        System.out.println("i < j is " + (i < j));
        System.out.println("i >= j is " + (i >= j));
        System.out.println("i <= j is " + (i <= j));
        System.out.println("i == j is " + (i == j));
        System.out.println("i != j is " + (i != j));

        // 用int作为bool处理，在Java中是不合法的。
        //System.out.println(i && j);

        System.out.println("(i < 10) && (i < 10) is " + ((i < 10) && (i < 10)));
        System.out.println("(i < 10) || (i < 10) is " + ((i < 10) || (i < 10)));
    }
}
