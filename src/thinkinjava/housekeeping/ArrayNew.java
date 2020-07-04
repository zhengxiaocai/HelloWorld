package thinkinjava.housekeeping;

import java.util.*;

//>>TODO:  1. Random(seed).nextInt(bound)  生成一个0到bound之前的整数
//>>TODO:  2. Arrays.toString(array)   返回一维数组的可打印版本

//>>TODO:  鼓励： 在数组定义的同时进行初始化

public class ArrayNew {

    public static void main(String[] args) {
        int[] a;
        Random rand = new Random(47);
        a = new int[rand.nextInt(20)];
        System.out.println("Length of a = " + a.length);
        System.out.println(Arrays.toString(a));
    }
}
