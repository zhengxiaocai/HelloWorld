package thinkinjava.control;

public class CommaOperator {
    // >>TODO:通过逗号，可以在for的初始化 步进控制中定义多个变量
    public static void main(String[] args) {
        for (int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
            System.out.println("i : " + i + " j : " + j);
        }
    }
}
