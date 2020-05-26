public class IfElseNum {
    public static void main(String[] args) {
        int n = 3;

        String ret = n + "对应的汉字是";

        if (n == 0) {
            ret += "零";
        } else if (n == 1) {
            ret += "壹";
        } else if (n == 2) {
            ret += "贰";
        } else if (n == 3) {
            ret += "叁";
        } else if (n == 4) {
            ret += "肆";
        } else if (n == 5) {
            ret += "伍";
        } else if (n == 6) {
            ret += "陆";
        } else if (n == 7) {
            ret += "柒";
        } else if (n == 8) {
            ret += "捌";
        } else if (n == 9) {
            ret += "玖";
        } else if (n == 10) {
            ret += "拾";
        } else {
            System.out.println("错误的数字。");
        }
        System.out.println(ret);
    }
}
