public class SwitchNum {
    public static void main(String[] args) {
        /**
         * switch 只能判断int；
         * default语句是可选的，只有当所有case都匹配上才执行。
         * 不同的case中，不能声明相同的变量，因为是在同一作用域。
         */
        int n = 5;
        /*
         * 注释
         */

        String str = n + "对应的汉字是：";

        switch (n) {
            case 1:
                str += "壹";
                break;
            case 2:
                str += "贰";
                break;
            case 3:
                str += "叁";
                break;
            case 4:
                str += "肆";
                break;
            case 5:
                str += "伍";
                break;
            case 6:
                str += "陆";
                break;
            case 7:
                str += "柒";
                break;
            case 8:
                str += "捌";
                break;
            case 9:
                str += "玖";
                break;
            default:
                System.out.println("输入的值错误。");
        }
        System.out.println(str);
    }
}
