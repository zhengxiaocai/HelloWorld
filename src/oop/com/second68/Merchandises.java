package oop.com.second68;

public class Merchandises {

    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;


    // >> TODO: ~~~~~构造方法的重载~~~~~
    // >> TODO: 在构造方法里才能调用重载的构造方法，语法为 this(参数列表)
    // >> TODO: 构造方法不能自己调用自己，这会是一个死循环。
    // >> TODO: 在调用重载的构造方法时，不可以使用成员变量。因为在语义上，对象还没有初始化完成，处于中间状态。
    // >> TODO: 在构造方法里调用构造方法时，必须是方法的第一行。

    public Merchandises(String name, String id, int count, double soldPrice){
        this(name, id, count, soldPrice, soldPrice * 0.8);
    }

    // >> TODO: constructor 构造器名称必须跟类名一致。无返回值。
    // >> TODO: 如果没有显式的添加构造方法，会默认提供一个；如果提供了，就不在默认提供。
    // >> TODO: 不能当成普通方法调用，只能通过new调用。

    public Merchandises(String name, String id, int count,
                        double soldPrice, double purchasePrice){
        this.name = name;
        this.id = id;
        this.count = count;
        this.soldPrice = soldPrice;
        this.purchasePrice = purchasePrice;
    }

    public Merchandises(){

    }

    public void describe() {
        System.out.println("商品名字叫做" + name + "，id是" + id + "。 商品售价是" + soldPrice
                + "。商品进价是" + purchasePrice + "。商品库存量是" + count +
                "。销售一个的毛利润是" + (soldPrice - purchasePrice));
    }

    public double buy(int count){
        if (this.count < count){
            return -1;
        }
        return this.count -= count;
    }

}
