import java.util.Scanner;

public class Subject {
    public static void main(String[] args) {

        // 每门课的索引
        int YuWen = 0;
        int ShuXue = 1;
        int WaiYu = 2;
        int WuLi = 3;
        int ShengWu = 4;
        int HuaXue = 5;

        int totalSubject = 6;

        String[] subject = new String[totalSubject];

        // 给subject赋值
        subject[YuWen] = "语文";
        subject[ShuXue] = "数学";
        subject[WaiYu] = "外语";
        subject[WuLi] = "物理";
        subject[ShengWu] = "生物";
        subject[HuaXue] = "化学";

        double[] year1 = new double[totalSubject];
        // 给成绩赋随机大于80数字。
        for (int i = 0; i < totalSubject; i++) {
            year1[i] = 80 + Math.random() * 20;
        }

        double[] year2 = new double[totalSubject];
        // 给成绩赋随机大于80数字。
        for (int i = 0; i < totalSubject; i++) {
            year2[i] = 80 + Math.random() * 20;
        }

        double[] year3 = new double[totalSubject];
        // 给成绩赋随机大于80数字。
        for (int i = 0; i < totalSubject; i++) {
            year3[i] = 80 + Math.random() * 20;
        }

        double[] yearToUser;

        // 获取用户想看哪一年的
        System.out.println("输入你想查看成绩的年份：");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();

        switch (year) {
            case 1:
                yearToUser = year1;
                break;
            case 2:
                yearToUser = year2;
                break;
            case 3:
                yearToUser = year3;
                break;
            default:
                System.out.println("输入年份有误，您将查看最新的一年。");
                yearToUser = year3;
        }

        System.out.println("输入你要查看成绩的编号：");
        int scoreIndex = in.nextInt();
        System.out.println("科目" + subject[scoreIndex] + year + "年的成绩是" + yearToUser[scoreIndex]);

//        double maxScore = 0;
//        int maxScoreIndex = -1;
//        for (int i = 0; i < totalSubject; i++) {
//            if (maxScore < year1[i]) {
//                maxScore = year1[i];
//                maxScoreIndex = i;
//            }
//        }
//        System.out.println("最好的科目是" + subject[maxScoreIndex] + "成绩是" + year1[maxScoreIndex]);
    }
}
