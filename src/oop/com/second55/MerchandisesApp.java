package oop.com.second55;

public class MerchandisesApp {
    public static void main(String[] args) {
        Merchandises merchandises = new Merchandises("书桌", "ID001",
                10, 100, 80);

        merchandises.describe();

        // >>TODO: 自己写了构造方法，就不在默认提供。
        Merchandises m = new Merchandises();
        m.describe();

    }
}
