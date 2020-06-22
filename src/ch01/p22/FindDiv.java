package ch01.p22;

public class FindDiv {
    // 从100开始，找到10个可以整除89的数
    public static void main(String[] args) {
        int n = 10;

        int dividend = 100;
        int divisor = 89;

        int found = 0;

        while (found < 10) {

            if (dividend % divisor == 0) {
                found++;
                System.out.println(dividend + "可以整除" + divisor + "商为" + (dividend / divisor));
            }

            dividend++;
        }
    }
}
