package thinkinjava.operators;

public class CastingNumbers {
    // 截断 舍入 >>TODO:浮点型转整型，小数位直接舍去
    public static void main(String[] args) {
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        System.out.println("(int)above : " + (int) above);
        System.out.println("(int)below : " + (int) below);
        System.out.println("(int)fabove : " + (int) fabove);
        System.out.println("(int)fbelow : " + (int) fbelow);
    }
}
