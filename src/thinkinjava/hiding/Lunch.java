package thinkinjava.hiding;

class Soup1 {
    private Soup1() {
    }

    //>>TODO: 这种就是正常的，可以做一些额外的操作，比如统计实例化的个数
    public static Soup1 makeSoup() {
        return new Soup1();
    }
}

class Soup2 {
    private Soup2() {
    }

    //>>TODO: 单例模式
    private static Soup2 ps1 = new Soup2();

    public static Soup2 access() {
        return ps1;
    }

    public void f() {
    }
}

public class Lunch {

    void testPrivate(){
//        Soup1 soup = new Soup1(); >>TODO: 无法访问
    }

    void testStatic(){
        Soup1 soup = Soup1.makeSoup();
    }

    void testSingleton(){
        Soup2.access().f();
    }
}
