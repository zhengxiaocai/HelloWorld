package oop.com.second43.supermarket;

import oop.com.geekbang.supermarket.Merchandise;
import oop.com.second43.supermarket.LittleSuperMarket;

import java.util.Scanner;

public class MerchandisesV2DescAppMain {
    public static void main(String[] args) {
        MerchandisesV2 merchandisesV2 = new MerchandisesV2();

        merchandisesV2.name = "HUAWEI mate30 5G";
        merchandisesV2.id = "ID12138";
        merchandisesV2.soldPrice = 4500;
        merchandisesV2.purchasePrice = 3000;
        merchandisesV2.count = 300;

        merchandisesV2.describe();

        MerchandisesV2 giftNoodle = new MerchandisesV2();
        giftNoodle.name = "赠品-面条";
        giftNoodle.count = 2000;
        giftNoodle.soldPrice = 0.05;
        giftNoodle.purchasePrice = 5;
        giftNoodle.id = "GIFT001";

        MerchandisesV2 giftBowl = new MerchandisesV2();
        giftBowl.name = "赠品-碗";
        giftBowl.count = 2000;
        giftBowl.purchasePrice = 8;
        giftBowl.soldPrice = 0.08;
        giftBowl.id = "GIFT002";

        LittleSuperMarket superMarket = new LittleSuperMarket();

        superMarket.merchandisesV2s = new MerchandisesV2[200];

        MerchandisesV2[] all = superMarket.merchandisesV2s;

        for (int i = 0; i < all.length; i++) {
            MerchandisesV2 m = new MerchandisesV2();

            m.name = "商品" + i;
            m.id = "ID" + i;
            m.count = 200;
            m.purchasePrice = Math.random() * 200;
            m.soldPrice = (1 + Math.random()) * 200;
            m.gift = giftNoodle;

            all[i] = m;
        }

        superMarket.getBiggestProfitMerchandises().describe();

        MerchandisesV2 m0 = all[0];

        MerchandisesV2 m122 = new MerchandisesV2();
        MerchandisesV2 paramRef02 = all[2];

        m122.gift = giftBowl;
        System.out.println("gift变化之前");
        m122.describe();
        paramRef02.describe();
        m122.changeToTheSameGift(paramRef02);
        System.out.println("gift变化之后");
        paramRef02.describe();

        // 第二件半价
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("今天超市大促，第二件半价。请输入要购买的商品的索引：");
            int index = scanner.nextInt();

            if (index < 0) {
                System.out.println("欢迎下次光临！");
                break;
            }

            if (index > all.length) {
                System.out.println("超过商品数量。");
                continue;
            }

            double price = all[index].soldPrice;
            System.out.println("商品的单价为：" + price);

            System.out.println("请输入您要购买的数量：");
            int count = scanner.nextInt();

            System.out.println("请输入是否查看剩余库存？true or false");
            boolean isPrintLeft = scanner.nextBoolean();

            // 传入的入参可以是一个表达式。只要表达式的类型与形参一致即可。
            int c = 7;
            double total = all[index].buy((c + 2) * 5);

            // 对于引用类型来说，参数同样可以是个表达式。
            boolean biggerThan = all[index].isTheBiggerThan(superMarket.merchandisesV2s[index + 1]);
            System.out.println("当前商品比下一个贵：" + biggerThan);

            // >> TODO: 方法里的代码并不能改变实参的值。
            MerchandisesV2 paramRef = superMarket.merchandisesV2s[2];
            int paramPrime = 7;

            System.out.println("调用前");
            System.out.println(paramRef);
            System.out.println(paramPrime);

            all[index].willOutsideValueChangeIfParameterValueChangeHerePrime(paramPrime);
            all[index].willOutsideValueChangeIfParameterValueChangeHereRef(paramRef);

            System.out.println("调用后");
            System.out.println(paramRef);
            System.out.println(paramPrime);

            // >> TODO:通过返回值，操作同一个对象。
            MerchandisesV2 m99 = all[99];
            m99.gift.describe();
            MerchandisesV2 giftOfm99 = m99.getGiftAndHowCanOutsideChangeIt();
            giftOfm99.soldPrice = 99999;
            m99.gift.describe();

            double totalCost = all[index].buyAndPrintLeft(count, isPrintLeft);

            System.out.println("总价：" + totalCost);

            System.out.println("是超市最贵的商品：" + all[index].isTheBiggestTotalValueOne(superMarket));

            boolean m0BiggerThan = m0.isTheBiggerThan(all[index]);
            System.out.println("m0BiggerThan " + m0BiggerThan);
        }
    }
}
