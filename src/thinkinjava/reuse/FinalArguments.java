package thinkinjava.reuse;

//>>TODO: final类型的参数，表现跟普通的是一样的。
//>>TODO: 基本类型的只能访问，不能改变；引用类型的可以改变属性，不能改变应用地址。

class Gizmo {
    int i;
    public void spin() {

    }
}

public class FinalArguments {
    void with(final Gizmo g) {
//        g= new Gizmo(); >>TODO:给final引用参数重新赋值是不允许的。
        g.i = 90;
    }


    void without(Gizmo g) {
        g = new Gizmo();
        g.spin();
    }

    void f(final int i) {
//        i++;      >>TODO:给final基本类型参数重新赋值，也是不允许的。
    }

    int g(final int i) {
        return i + 1;
    }

    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.with(null);
        bf.without(null);
    }
}
