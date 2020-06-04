package oop.com.second57;

// >> TODO: 可以通过 import static 方法把 static 导入进来。(新特性)
import static oop.com.second57.Merchandises57.DISCOUNT_FOR_VIP;

public class TestStatic {
    public static void main(String[] args) {

        System.out.println(Merchandises57.DISCOUNT_FOR_VIP);

        System.out.println(DISCOUNT_FOR_VIP);

        Merchandises57 m = new Merchandises57();

        m.soldPrice = 100;
        m.count = 100;

        double sumMoney95 = m.buyAsVIP(10, true);
        System.out.println(sumMoney95);

        // >> TODO: 类变量为所有对象共有，只要改了就全改了。
        DISCOUNT_FOR_VIP = 0.5;
        double sumMoney50 = m.buyAsVIP(10, true);
        System.out.println(sumMoney50);
    }
}
