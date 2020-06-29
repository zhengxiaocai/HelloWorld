package thinkinjava.housekeeping;

public class Leaf {

    //>>>TODO:this使用场景之一，返回当前对象。

    int i = 0;

    Leaf increment() {
        i++;
        return this;
    }

    void print() {
        System.out.println("i=" + i);
    }

    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        leaf.increment().increment().increment().print();
    }
}
