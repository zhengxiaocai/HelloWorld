package thinkinjava.housekeeping;

import java.util.*;

//>>TODO: 直到赋值完成，初始化才算结束。
//>>TODO: Integer[] a = new Integer[length]; 这种形式只能用在定义的时候。

public class ArrayClassObj {

    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] a = new Integer[rand.nextInt(20)];
        System.out.println("Length of a is " + a.length);
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(500);
        }
        System.out.println(Arrays.toString(a));
    }
}
