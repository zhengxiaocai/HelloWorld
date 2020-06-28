package thinkinjava.housekeeping;

/**
 *  基本类型如果传入类型小，会调用最接近的；如果传入类型大，编译器会报错。
 */
public class PrimitiveOverloading {

    static void f1(int x){
        System.out.println("f1(int)");
    }
    static void f1(long x){
        System.out.println("f1(long)");
    }
    static void f1(float x){
        System.out.println("f1(float)");
    }

    public static void main(String[] args) {
        f1(1);
//        f1(1.1);
        f1('x');
    }
}
