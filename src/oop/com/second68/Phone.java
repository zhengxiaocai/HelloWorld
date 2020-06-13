package oop.com.second68;

import oop.com.second73.MerchandiseV2;

public class Phone extends Merchandises {

    private double screenSize;
    private double cpuHz;
    private int storageG;
    private int memoryG;
    private String brand;
    private String os;

    private static int MAX_BUY_ONE_ORDER = 2;

    // >>TODO: 方法签名一致，返回值一致。

    public double buy(int count) {
        if (count > MAX_BUY_ONE_ORDER) {
            System.out.println("购买失败，一次只能买" + MAX_BUY_ONE_ORDER + "个。");
            return -2;
        }

        if (count > this.count) {
            System.out.println("库存不足");
            return -1;
        }

        this.count -= count;
        double cost = count * soldPrice;
        System.out.println("共花费" + cost);
        return cost;
    }
}
