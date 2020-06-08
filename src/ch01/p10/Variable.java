package ch01.p10;

public class Variable {

    public static void main(String[] args) {
        /**
         * int 4个字节 一个字节八个储存单位 32个bit
         * -2^32 ~ 2^32-1  大约21亿
         */
        int a = 3;
        int b = 5;
        int c = 7;

        int x = 1;

        int y = a * x + b * x * x + c * x * x * x;

        System.out.println(y);

        /**
         * 成员变量会根据类型赋初始值
         * 局部变量不会有初始值
         */
    }
}
