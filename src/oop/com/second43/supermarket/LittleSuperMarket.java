package oop.com.second43.supermarket;

public class LittleSuperMarket {

    public MerchandisesV2[] merchandisesV2s;

    public MerchandisesV2 getBiggestProfitMerchandises() {

        MerchandisesV2 curr = null;

        for (int i = 0; i < merchandisesV2s.length; i++) {
            MerchandisesV2 m = merchandisesV2s[i];

            if (curr == null) {
                curr = m;
                continue;
            }

            double currProfit = curr.calculateProfit();
            double newProfit = m.calculateProfit();
            if (currProfit < newProfit) {
                curr = m;
            }
        }
        return curr;
    }
}
