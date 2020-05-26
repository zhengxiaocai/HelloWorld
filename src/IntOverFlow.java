public class IntOverFlow {
    public static void main(String[] args) {
        int n = 10;

        int dividend = 2;
        int divisor = 2000000000;

        int found = 0;

        String start = "从" + dividend + "开始，";

        while (found < n) {

            if (dividend < 0) {
                System.out.println("数据溢出，计算结束。");
                break;
            }

            if (dividend % divisor == 0) {
                found++;
                System.out.println(dividend + "可以整除" + divisor + "，商为：" + dividend / divisor);
            }
            dividend++;
        }
        System.out.println(start + "共找到" + found + "个，可以整除" + divisor + "的数字。");
        System.out.println(dividend);
    }
}
