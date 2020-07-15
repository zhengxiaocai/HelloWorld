package thinkinjava.reuse;

//>>TODO: 一个类为final，说明他不能被继承。该类设计就是永远不需要改动，或者出于安全不希望他有子类。

class SmallBrain {
}

final class Dinosaur {
    int i = 7;
    int j = 1;
    SmallBrain x = new SmallBrain();

    void f() {
    }
}

//class Further extends Dinosaur{}
//>>TODO: 不能被继承

public class Jurassic {
    public static void main(String[] args) {
        Dinosaur n = new Dinosaur();
        n.f();
        n.i = 40;
        n.j++;
    }
}
