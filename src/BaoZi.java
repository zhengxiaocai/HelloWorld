public class BaoZi {
    public static void main(String[] args) {
        int baozi = 3;

        boolean baoziGangChuLu = true;

        if (baoziGangChuLu) {
            baozi = baozi + 2;
            System.out.println("包子刚出炉，买了" + baozi + "个肉包子。");
        } else {
            System.out.println("买了" + baozi + "个肉包子。");
        }
    }
}
