package ch01.p20;

public class CalcDivFor {

    public static void main(String[] args) {
        int divided = 100;
        int divisor = 3;
        int count = 1;

        //>>TODO 需求是最多找10个就行了
        // >>TODO： 这个是我的，还是循环了100遍；多考虑下吧
//        for (int i = 1; i <= 100; i++) {
//            if (divided % divisor == 0 && count<=10) {
//                count++;
//                System.out.println(divided + "可以被" + divisor + "整除，商是" + (divided / divisor));
//            }
//            divided++;
//        }

        // >>TODO: 这个是教程的，循环了30遍
        // >>TODO: 最后一个可以放多个语句，用逗号隔开就行
        for (int i = 1; i <= 100 && count <= 10; i++, divided++) {
            if (divided % divisor == 0) {
                count++;
                System.out.println(divided + "可以被" + divisor + "整除，商是" + (divided / divisor));
            }
        }
    }
}
