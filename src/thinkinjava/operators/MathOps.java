package thinkinjava.operators;

import java.util.Random;

public class MathOps {

    public static void main(String[] args) {
        // new Random(seed) seed为随机数种子，设置之后，后边那个数是不变的
        Random rand = new Random(47);
        int i, j, k;
        // random.nextInt(bound) bound为上限
        j = rand.nextInt(100) + 1;
        System.out.println("j : " + j);
        k = rand.nextInt(100) + 1;
        System.out.println("k : " + k);
        i = j + k;
        System.out.println("j + k : " + i);
        i = j - k;
        System.out.println("j - k : " + i);
        i = j / k;
        System.out.println("j / k : " + i);
        i = j * k;
        System.out.println("j * k : " + i);
        i = j % k;
        System.out.println("j % k : " + i);
        j %= k;
        System.out.println("j %= k : " + j);

        // 浮点型运算
        float u, v, w;
        v = rand.nextFloat();
        System.out.println("v : " + v);
        w = rand.nextFloat();
        System.out.println("w : " + w);
        u = v + w;
        System.out.println("v + w : " + u);
        u = v - w;
        System.out.println("v - w : " + u);
        u = v * w;
        System.out.println("v * w : " + u);
        u = v / w;
        System.out.println("v / w : " + u);

        // 简写
        u += v;
        System.out.println("u += v : " + u);
        u -= v;
        System.out.println("u -= v : " + u);
        u *= v;
        System.out.println("u *= v : " + u);
        u /= v;
        System.out.println("u /= v : " + u);
    }
}
