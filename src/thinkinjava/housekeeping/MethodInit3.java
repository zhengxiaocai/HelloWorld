package thinkinjava.housekeeping;

public class MethodInit3 {

    //>>TODO: 使用方法初始化可以带参数，但是，参数不能是没有初始化的成员变量。

//    int j = g(i);
    int i = f();

    int f() {
        return 11;
    }

    int g(int n) {
        return n * 10;
    }
}
