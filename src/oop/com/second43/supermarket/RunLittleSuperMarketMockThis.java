/**
 * package 语句必须放到有效语句的第一行
 * 注释不是有效语句，可以不遵从。
 */
package oop.com.second43.supermarket;

/**
 * @author Ruby
 */
public class RunLittleSuperMarketMockThis {
    public static void main(String[] args) {
        LittleSuperMarketMockThis littleSuperMarketMockThis = new LittleSuperMarketMockThis();
        littleSuperMarketMockThis.init("有家超市", "世纪大道666号",
                100, 200);
//        littleSuperMarketMockThis.superMarketName = "有家超市";
//        littleSuperMarketMockThis.superMarketAddress = "世纪大道666号";
//        littleSuperMarketMockThis.merchandises = new MerchandisesMockThis[200];
//
//        MerchandisesMockThis[] all = littleSuperMarketMockThis.merchandises;
//
//        for (int i = 0; i < all.length; i++) {
//            MerchandisesMockThis m = new MerchandisesMockThis();
//            m.name = "商品" + i;
//            m.id = "ID" + i;
//            m.count = 200;
//            m.purchasePrice = Math.random() * 200;
//            m.soldPrice = (1 + Math.random()) * 200;
//            all[i] = m;
//        }

        System.out.println("下面有请利润最高的商品自我介绍：");
        MerchandisesMockThis m = littleSuperMarketMockThis.getBiggestProfitMerchandises();
        m.describe();
        System.out.println("");
        m.makeEnoughForOneByOne(500);
        m.describe();
    }
}
