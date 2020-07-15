package thinkinjava.reuse;

//>>TODO: 没有初始化的final属性，必须确保在使用之前完成初始化。
//>>TODO: 在每个构造器里执行final属性的赋值操作。

class Poppet {
    private int i;

    Poppet(int i) {
        this.i = i;
    }
}

public class BlankFinal {
    private final int i = 0;
    private final int j;
    private final Poppet p;

    public BlankFinal() {
        j = 0;
        p = new Poppet(1);
    }

    public BlankFinal(int x) {
        j = x;
        p = new Poppet(x);
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);
    }
}
