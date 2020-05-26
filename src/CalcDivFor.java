public class CalcDivFor {
    public static void main(String[] args) {
        /**
         * for 循环里的判断，可以是多个条件。
         */
        int divied = 100;
        int divsor = 3;
        int found = 0;
        int toBeFound = 10;

        for (int i = 0; i < 100; i++) {
            if (divied % divsor == 0) {
                System.out.println(divied + "可以整除" + divsor + "，商为" + divied / divsor);
                found++;
            }
            if (found >= toBeFound){
                System.out.println("已经到toBeFound限制，break");
                break;
            }
            divied++;
        }
    }
}
