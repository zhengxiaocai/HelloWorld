package oop.com.geekbang;

import oop.com.geekbang.person.Customer;
import oop.com.geekbang.supermarket.LittleSuperMarket;
import oop.com.geekbang.supermarket.Merchandise;

import java.util.Scanner;

public class RunLittleSuperMarketAppMain {
    public static void main(String[] args) {
        LittleSuperMarket littleSuperMarket = new LittleSuperMarket();

        littleSuperMarket.address = "世纪大道666号";
        littleSuperMarket.superMarketName = "超市入口";
        littleSuperMarket.parkingCount = 200;
        littleSuperMarket.merchandises = new Merchandise[200];
        littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandises.length];

        // 给 littleSuperMarket.merchandises 赋值时，太长。可以用一个变量代替一下。
        Merchandise[] all = littleSuperMarket.merchandises;

        for (int i = 0; i < all.length; i++) {
            Merchandise m = new Merchandise();
            m.name = "商品" + i;
            m.id = "ID" + i;
            m.count = 200;
            m.purchasePrice = Math.random() * 200;
            m.soldPrices = (1 + Math.random()) * 200;
            all[i] = m;
        }

        System.out.println("超市开门了！");

        boolean open = true;
        Scanner scanner = new Scanner(System.in);

        while (open) {
            System.out.println("本店叫做：" + littleSuperMarket.superMarketName);
            System.out.println("本店地址：" + littleSuperMarket.address);
            System.out.println("本店共有停车位：" + littleSuperMarket.parkingCount);
            System.out.println("本店共有商品：" + littleSuperMarket.merchandises.length + "种");
            System.out.println("今天的营业额：" + littleSuperMarket.incomingSum);

            Customer customer = new Customer();
            customer.name = "顾客编号" + (int) (Math.random() * 10000);
            customer.money = (1 + Math.random()) * 1000;
            customer.isDrivingCar = Math.random() > 0.5;

            // TODO: customer.isDrivingCar == true; 这种比较傻的就不要写了。
            // TODO: customer.isDrivingCar && littleSuperMarket.parkingCount <= 0
            // TODO：以上：只有这一种情况需要处理的时候才会这样写，否则还是分开，然后多层。
            if (customer.isDrivingCar) {
                if (littleSuperMarket.parkingCount > 0) {
                    System.out.println("欢迎" + customer.name + "驾车光临，我们已经给你备好了车位，编号为" + littleSuperMarket.parkingCount);
                    littleSuperMarket.parkingCount--;
                } else {
                    System.out.println("暂时没有停车位，无法进入超市。");
                    continue;
                }
            } else {
                System.out.println("欢迎" + customer.name + "绿碳出行，光临超市。");
            }

            double totalCost = 0;
            while (true) {
                System.out.println("我们提供" + all.length + "种商品。请输入商品编号购买：");
                int index = scanner.nextInt();

                // 校验输入商品编号的正确性
                if (index < 0) {
                    break;
                }
                if (index >= 200) {
                    System.out.println("本店没有相关商品。请输入编号为0~" + (all.length - 1) + "之间的商品。");
                    continue;
                }

                Merchandise m = all[index];

                System.out.println("您选购的商品的价格是：" + m.soldPrices + "请问您需要买多少个？");
                int numToBuy = scanner.nextInt();

                if (numToBuy <= 0) {
                    System.out.println("不买看看也好。");
                    continue;
                }

                if (numToBuy > m.count){
                    System.out.println("该商品库存不足，请重新填写库存。");
                    continue;
                }

                if (numToBuy * m.soldPrices > customer.money) {
                    System.out.println("您带的钱不够，请重新挑选数量。");
                    continue;
                }

                totalCost += numToBuy * m.soldPrices;

                all[index].count -= numToBuy;
                littleSuperMarket.merchandiseSold[index] += numToBuy;

                customer.money -= totalCost;
            }

            if (customer.isDrivingCar) {
                littleSuperMarket.parkingCount++;
            }

            System.out.println("顾客" + customer.name + "共消费" + totalCost);

            littleSuperMarket.incomingSum += totalCost;

            System.out.println("是否继续营业？true false");
            open = scanner.nextBoolean();
        }
        System.out.println("超市关门了。");
        System.out.println("今天的营业额为" + littleSuperMarket.incomingSum);

        for (int i = 0; i < littleSuperMarket.merchandises.length; i++) {
            Merchandise m = all[i];
            int numSold = littleSuperMarket.merchandiseSold[i];
            if (numSold > 0) {
                double incoming = m.soldPrices * numSold;
                double netIncoming = (m.soldPrices - m.purchasePrice) * numSold;
                System.out.println(m.name + "共卖了：" + incoming + "利润：" + netIncoming);
            }
        }
    }
}
