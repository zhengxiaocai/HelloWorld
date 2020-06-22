package ch01.p22;

public class Break {

    public static void main(String[] args) {
        int n = 10;

        int dividend = 100;
        int divisor = 2000000000;

        int found = 0;

        String start = "从" + dividend + "开始";

        while (found < n) {

            if (dividend < 0) {
                System.out.println("整数溢出，计算结束");
                break;
            }

            if (dividend % divisor == 0) {
                found++;
                System.out.println(dividend + "可以被" + divisor + "整除，商为" + (dividend / divisor));
            }

            dividend++;

        }

        System.out.println(start + "，共找到" + found + "个");
    }
}
