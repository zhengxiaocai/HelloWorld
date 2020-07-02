package thinkinjava.housekeeping;

public class MethodInit2 {

    //>>TODO: 方法初始化的方法，可以带参数，但是，参数不能是没有被初始化的

    int i = f();
    int j = g(i);

    int f() {
        return 11;
    }

    int g(int n) {
        return n * 10;
    }
}
