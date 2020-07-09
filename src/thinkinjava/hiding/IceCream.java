package thinkinjava.hiding;

class Sundae{
    private Sundae(){}
    static Sundae makeASundae(){
        return new Sundae();
    }
}

public class IceCream {

    public static void main(String[] args) {
//        Sundae y = new Sundae(); >>TODO 类外，private成员无法访问。
        Sundae x = Sundae.makeASundae();
    }
}
