package oop.com.second73;

public class ReferenceAssign {

    public static void main(String[] args) {
        Phone phone = new Phone("Phone", "ID001", 30, 5000, 4000,
                6.0, 5.2, 128, 8, "HUAWEI", "Android");

        // >>TODO: 子类的引用给父类的引用赋值，也就是说，父类的应用可以指向子类的对象。
        MerchandiseV2 m = phone;

        MerchandiseV2 m2 = new Phone("Phone", "ID001", 30, 5000, 4000,
                6.0, 5.2, 128, 8, "HUAWEI", "Android");

        // >>TODO: 反过来是不行的，不能让子类的引用指向父类的对象。
//        Phone notDoable = new MerchandiseV2();

        // >>TODO: 当父类的引用指向子类的实例，只能像父类一样操作子类的对象。
        phone.getBrand();
//      m.getBrand();       // 没有这个方法



    }
}
