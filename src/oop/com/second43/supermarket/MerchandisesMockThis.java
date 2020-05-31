package oop.com.second43.supermarket;

public class MerchandisesMockThis {

    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;

    public void init(String name, String id, int count, double soldPrice, double purchasePrice){
        this.name = name;
        this.id = id;
        this.count = count;
        this.soldPrice = soldPrice;
        this.purchasePrice = purchasePrice;
    }

    public void describe() {
        double netIncome = this.soldPrice - this.purchasePrice;
        System.out.println("商品名称叫做" + this.name + "，id是" + this.id + "。商品售价是" + this.soldPrice +
                "，商品进价是" + this.purchasePrice + "，商品库存" + this.count + "，销售一件的毛利是" + netIncome);
    }

    double calculateProfit() {
        double profit = soldPrice - purchasePrice;
        return profit;
    }

    public int getCount() {
        return this.count;
    }

    public void addCount(int count) {
        this.count += count;
    }

    public boolean hasEnoughCountFor(int count) {
        return this.count >= count;
    }

    public void makeEnoughFor(int count) {
        boolean hasEnough = this.hasEnoughCountFor(count);
        if (!hasEnough) {
            int toBeAdd = count - this.count;
            this.addCount(toBeAdd);
        }
    }

    public void makeEnoughForOneByOne(int count) {
        boolean hasEnough = this.hasEnoughCountFor(count);
        if (!hasEnough) {
            this.addCount(1);
            this.makeEnoughForOneByOne(count);
        }
    }
}
