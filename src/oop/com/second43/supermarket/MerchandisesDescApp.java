package oop.com.second43.supermarket;

public class MerchandisesDescApp {
    public static void main(String[] args) {
        MerchandisesMockThis m = new MerchandisesMockThis();
        m.init("书", "book001", 300, 99, 80);
        m.describe();
    }

}
