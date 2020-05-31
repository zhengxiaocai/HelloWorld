package oop.com.second53;

public class MerchandiseOverload {
    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;

    public void init(String name, String id, int count, double soldPrice, double purchasePrice) {
        this.name = name;
        this.id = id;
        this.count = count;
        this.soldPrice = soldPrice;
        this.purchasePrice = purchasePrice;
    }

    public void describe() {
        System.out.println("商品名字叫做" + name + "，id是" + id + "。 商品售价是" + soldPrice
                + "。商品进价是" + purchasePrice + "。商品库存量是" + count +
                "。销售一个的毛利润是" + (soldPrice - purchasePrice));
    }

    // >>TODO: 以上是copy的
    // >>TODO: 签名（函数名+参数列表）
    // >>TODO: 下边来用函数重载来重写buy方法。

    // >>TODO: 重载的方法，可以调用重载的方法。（其实是任意方法都可以）
    // >>TODO: 补充一些缺省值，调用重载的方法，是最常用的使用场景。 比较帅。
    // >>TODO: 返回值类型为什么不是重载的条件？因为，哪怕返回值类型不一，调用的时候是一样的。

    // >>TODO: 如果重载的时候，一个int 一个double，会根据实参的就近原则匹配
    // >>TODO: byte>short>int>long>float>double

    public double buy() {
        return this.buy(1);
    }

    public double buy(int count) {
        return this.buy(count, false);
    }

    /**
     * 最全的bug方法，最复杂的应该先写
     *
     * @param count 购买商品的数量
     * @param isVIP 是否是VIP
     * @return 所需金额
     */
    public double buy(int count, boolean isVIP) {
        if (count > this.count) {
            return -1;
        }
        this.count -= count;
        if (isVIP) {
            return count * soldPrice * 0.95;
        } else {
            return count * soldPrice;
        }
    }
}
