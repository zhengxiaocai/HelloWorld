package oop.com.second66MainSystem;

public class LearnSystem {

    public static void main(String[] args) {
        long startMS = System.currentTimeMillis();

        int counter = 0;
        for (int i = 0; i < 100000; i++) {
            counter++;
        }

        long endMS = System.currentTimeMillis();

        System.out.println("共用毫秒：" + (endMS - startMS));

        long startNS = System.nanoTime();

        counter = 0;
        for (int i = 0; i < 1000; i++) {
            counter++;
        }

        long endNS = System.nanoTime();

        System.out.println("共用纳秒：" + (endNS - startNS));
    }
}
