package oop.com.second53;

public class Merchandise {
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

    /**
     * 为了方便起见，购买一个，就不需要传参数
     *
     * @return 价格
     */
    public double buyOne() {
        int count = 1;
        if (this.count < count) {
            return -1;
        }
        this.count--;
        return soldPrice * count;
    }

    /**
     * 根据传入购买数量，计算所需金额
     *
     * @param count 传入购买数量
     * @return 所需金额
     */
    public double buyCount(int count) {
        if (this.count < count) {
            return -1;
        }
        this.count -= count;
        return soldPrice * count;
    }

    /**
     * VIP购买，九五折
     *
     * @param count 传入购买数量
     * @param isVIP 是否是VIP
     * @return 所需金额
     */
    public double buyAsVIP(int count, boolean isVIP) {
        if (count > this.count) {
            return -1;
        }
        this.count -= count;
        if (isVIP){
            return soldPrice * count * 0.95;
        }else {
            return soldPrice * count;
        }
    }


}
