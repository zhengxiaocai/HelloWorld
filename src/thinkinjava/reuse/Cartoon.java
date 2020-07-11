package thinkinjava.reuse;

//>>TODO: 实例化派生类时，会自动调用基类的无参构造器。

class Art {
    Art() {
        System.out.println("Art constructor");
    }
}

class Drawing extends Art {
    Drawing(){
        System.out.println("Drawing constructor");
    }
}

public class Cartoon extends Drawing{
    public Cartoon(){
        System.out.println("Cartoon constructor");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}
