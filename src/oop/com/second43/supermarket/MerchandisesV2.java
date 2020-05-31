package oop.com.second43.supermarket;

import oop.com.geekbang.supermarket.Merchandise;

public class MerchandisesV2 {
    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;

    public MerchandisesV2 gift;

    public void describe() {
        double netIncome = soldPrice - purchasePrice;
        System.out.println("商品名称叫做" + name + "，id是" + id + "。商品售价是" + soldPrice +
                "，商品进价是" + purchasePrice + "，商品库存" + count + "，销售一件的毛利是" +
                netIncome + "，赠品是" + gift);
    }

    public double calculateProfit() {
        double profit = soldPrice - purchasePrice;

        if (profit <= 0) {
            return 0;
        }

        return profit;
    }

    // 自动return的类型和定义的返回类型一致 或者 自动类型转换得到，是可以的
    public double getCurrentCount() {
        return count;
    }

    // 类型不一致 或者自动类型转换之后不一致，需要强制类型转换
    public int getSoldPrice() {
        return (int) soldPrice;
    }

    // 第二件半价时，根据购买商品的数量，计算所需总价
    public double buy(int countToBuy) {
        if (countToBuy > count) {
            System.out.println("库存不足。");
            return -1;
        }

        System.out.println("商品单价为：" + soldPrice);

        int fullPriceCount = countToBuy / 2 + countToBuy % 2;
        int halfPriceCount = countToBuy - fullPriceCount;
        double totalCost = soldPrice * fullPriceCount + halfPriceCount * soldPrice / 2;

        count -= countToBuy;

        return totalCost;

    }

    //设计个方法，传入两个参数，购买和根据需要打印剩余商品
    public double buyAndPrintLeft(int countToBuy, boolean isPrintLeft) {
        if (countToBuy > count) {
            System.out.println("库存不足。");
            if (isPrintLeft) {
                System.out.println("剩余库存为：" + count);
            }
            return -1;
        }

        System.out.println("商品单价为" + soldPrice);

        int fullPriceCount = countToBuy / 2 + countToBuy % 2;
        int halfPriceCount = countToBuy - fullPriceCount;
        double totalCost = soldPrice * fullPriceCount + halfPriceCount * soldPrice / 2;

        count -= countToBuy;

        if (isPrintLeft) {
            System.out.println("剩余库存为：" + count);
        }

        return totalCost;
    }

    public boolean isTheBiggerThan(MerchandisesV2 merchandisesV2) {
        return count * soldPrice > merchandisesV2.count * merchandisesV2.soldPrice;
    }

    public boolean isTheBiggestTotalValueOne(LittleSuperMarket littleSuperMarket) {
        double currentTotal = count * soldPrice;
        for (int i = 0; i < littleSuperMarket.merchandisesV2s.length; i++) {
            MerchandisesV2 m[] = littleSuperMarket.merchandisesV2s;
            double newTotal = m[i].soldPrice * m[i].count;
            // TODO:不推荐用double做比较，为啥？
            if (currentTotal < newTotal) {
                return false;
            }
        }
        return true;
    }

    public void willOutsideValueChangeIfParameterValueChangeHerePrime(int prime) {
        prime = 999999;
    }

    public void willOutsideValueChangeIfParameterValueChangeHereRef(MerchandisesV2 m) {
        m = gift;
    }

    public void changeToTheSameGift(MerchandisesV2 m) {
        m.gift = gift;
    }

    public MerchandisesV2 getGiftAndHowCanOutsideChangeIt() {
        return gift;
    }

    // >> TODO: 局部变量不能和参数重名。 会报错。
//    public void test(int count) {
//        int count;
//    }

    // >> TODO: 局部变量或者参数跟成员变量重名，怎么办？ this
    public void duplicateName(int count) {
        this.count += count;
    }

    public void addCount(int count) {
        this.count += count;
        System.out.println("MerchandisesV2的addCount使用的对象是" + this);
    }

    public boolean hasEnoughCountFor(int count) {
        System.out.println("MerchandisesV2的hasEnoughCountFor使用的对象是" + this);
        return this.count >= count;
    }

    public static void main(String[] args) {
        MerchandisesV2 m = new MerchandisesV2();
        m.count = 200;
        m.addCount(100);
        m.hasEnoughCountFor(300);
    }
}
