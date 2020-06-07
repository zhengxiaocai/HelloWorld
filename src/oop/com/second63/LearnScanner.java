package oop.com.second63;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class LearnScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个巨大的正数:");
        BigInteger bigInteger = scanner.nextBigInteger();
        System.out.println("请输入 这个数加多少？");
        BigInteger toBeAdd = scanner.nextBigInteger();
        System.out.println("结果为：" + bigInteger.add(toBeAdd));

        BigDecimal bigDecimal = new BigDecimal("999999999999990");
        System.out.println(bigDecimal);

        String s;
    }
}
