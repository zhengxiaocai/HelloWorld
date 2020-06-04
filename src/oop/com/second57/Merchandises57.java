package oop.com.second57;

public class Merchandises57 {
    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;

    // >> TODO: 静态变量（类变量）使用 static 修饰
    // >> TODO: 如果不赋值，Java也会赋以其类型的初始值。
    // >> TODO: 一般是全大写 下划线分割
    // >> TODO: 访问权限，根据防范控制符的规范来。

    public static double DISCOUNT_FOR_VIP = 0.95;

    // >> TODO: 静态方法用 static 访问。
    // >> TODO: 静态方法可以访问静态变量，包括自己的，和访问控制允许的静态变量。
    // >> TODO: 不能通过 this 访问成员变量。
    public static double getDiscountForVip(){
        return DISCOUNT_FOR_VIP;
    }

    public double buyAsVIP(int count, boolean isVIP) {
        if (count > this.count) {
            return -1;
        }
        this.count -= count;
        if (isVIP) {
            return soldPrice * count * DISCOUNT_FOR_VIP;
        } else {
            return soldPrice * count;
        }
    }
}
