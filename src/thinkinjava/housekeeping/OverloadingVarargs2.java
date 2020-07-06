package thinkinjava.housekeeping;

//>>TODO: 通过定义一个非可变参数，来避免编译器迷惑
//>>TODO: 这个运行报错了呀。为啥？
//>>TODO: 除了强转之外，能转就转，能装就装

public class OverloadingVarargs2 {

    static void f(float i, Character... args){
        System.out.println("first");
    }

    static void f(Character... args){
        System.out.println("second");
    }

    public static void main(String[] args) {
        f(1, 'b');
//        f('a', 'b');
    }
}
