package thinkinjava.control;

import java.util.Random;

public class ForInFloat {
    // >>TODO: for(type x : type[])
    public static void main(String[] args) {
        Random random = new Random(47);
        float[] f = new float[10];
        for (int i = 0; i < 10; i++) {
            f[i] = random.nextFloat();
        }
        for (float x : f) {
            System.out.println(x);
        }
    }
}
