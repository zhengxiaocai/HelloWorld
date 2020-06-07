package oop.com.second59;

public class DiscountMgr {
    public static double BASE_DISCOUNT;

    public static double VIP_DISCOUNT;

    public static double SVIP_DISCOUNT;

    public static double getDiscount() {
        return BASE_DISCOUNT;
    }

    public static double getDiscount(boolean isVip) {
        // >> TODO: 三元表达式。
        double svipDiscount = isVip ? SVIP_DISCOUNT : 1;
        return BASE_DISCOUNT * svipDiscount;
    }

    public static double getDiscount(int svipLevel) {
        double ret = getDiscount() * VIP_DISCOUNT;
        for (int i = 0; i < svipLevel; i++) {
            ret *= SVIP_DISCOUNT;
        }
        return ret;
    }

}
