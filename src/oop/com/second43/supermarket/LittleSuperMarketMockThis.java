package oop.com.second43.supermarket;

public class LittleSuperMarketMockThis {
    public String superMarketName;
    public String superMarketAddress;
    public int parkingCount;
    public double incomingSum;
    public MerchandisesMockThis[] merchandises;
    public int[] merchandiseSold;

    /**
     * 初始化超市对象
     * @param superMarketName 超市名称
     * @param superMarketAddress 超市地址
     * @param parkingCount 停车位数量
     * @param merchandiseCount 商品数量
     */
    public void init(String superMarketName, String superMarketAddress, int parkingCount, int merchandiseCount) {
        this.superMarketAddress = superMarketAddress;
        this.superMarketName = superMarketName;
        this.parkingCount = parkingCount;
        MerchandisesMockThis[] all = new MerchandisesMockThis[merchandiseCount];

        for (int i = 0; i < all.length; i++) {
            MerchandisesMockThis m = new MerchandisesMockThis();
            m.name = "商品" + i;
            m.id = "ID" + i;
            m.count = 200;
            m.purchasePrice = Math.random() * 200;
            m.soldPrice = (1 + Math.random()) * 200;
            all[i] = m;
        }
        this.merchandises = all;
    }

    /**
     * 获取利润最高的商品
     * @return 利润最高的 MerchandisesMockThis
     */
    public MerchandisesMockThis getBiggestProfitMerchandises() {
        System.out.println("LittleSuperMarketMockThis的getBiggestProfitMerchandises使用的对象是" + this);
        MerchandisesMockThis curr = null;
        for (int i = 0; i < this.merchandises.length; i++) {
            MerchandisesMockThis m = this.merchandises[i];
            if (curr == null || m.calculateProfit() > curr.calculateProfit()) {
                curr = m;
            }
        }
        return curr;
    }
}
