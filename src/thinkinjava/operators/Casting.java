package thinkinjava.operators;

public class Casting {
    // 基本类型转换 强制类型转换
    public static void main(String[] args) {
        int i = 200;
        long lng = (long) i;
        lng = i;
        long lng2 = (long) 200;
        lng2 = 200;
        i = (int) lng2;
    }
}
