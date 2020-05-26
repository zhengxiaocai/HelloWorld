import java.util.Scanner;

public class ScoreMaster {
    public static void main(String[] args) {
        // 每门课的索引
        int YuWen = 0;
        int ShuXue = 1;
        int WaiYu = 2;
        int WuLi = 3;
        int ShengWu = 4;
        int HuaXue = 5;

        int totalSubject = 6;

        String[] names = new String[totalSubject];

        // 给subject赋值
        names[YuWen] = "语文";
        names[ShuXue] = "数学";
        names[WaiYu] = "外语";
        names[WuLi] = "物理";
        names[ShengWu] = "生物";
        names[HuaXue] = "化学";

        System.out.println("请输入共有多少年的成绩？");

        Scanner in = new Scanner(System.in);

        int yearCount = in.nextInt();

        double[][] scores = new double[yearCount][totalSubject];

        for (int i = 0; i < yearCount; i++) {
            for (int j = 0; j < totalSubject; j++) {
                scores[i][j] = 80 + Math.random() * 20;
            }
        }

        boolean cont = true;
        while (cont) {
            System.out.println("请输入你要进行的操作：");
            System.out.println("1：求某年最好的成绩\n" +
                    "2：求某年的平均成绩\n" +
                    "3：求所有年份最好的成绩\n" +
                    "4：求某门课历年最好的成绩");

            int oprtId = in.nextInt();

            int year = 0;

            switch (oprtId) {
                case 1:
                    System.out.println("请输入要求最高成绩的年份：");
                    year = in.nextInt();
                    if (year <= 0 || year > yearCount) {
                        System.out.println("年份非法。");
                        break;
                    }
                    double maxScore = 0;
                    for (int i = 0; i < scores[year - 1].length; i++) {
                        if (scores[year - 1][i] >= maxScore) {
                            maxScore = scores[year - 1][i];
                        }
                    }
                    System.out.println("第" + year + "年的最高成绩是" + maxScore);
                    break;
                case 2:
                    System.out.println("请输入要求平均成绩的年份：");
                    year = in.nextInt();
                    double sumScore = 0;
                    for (int i = 0; i < scores[year - 1].length; i++) {
                        sumScore += scores[year - 1][i];
                    }
                    System.out.println("第" + year + "年的平均成绩是" + (sumScore / scores[year - 1].length));
                    break;
                case 3:
                    double maxScorePerYear = 0;
                    for (int i = 0; i < scores.length; i++) {
                        for (int j = 0; j < names.length; j++) {
                            if (scores[i][j] >= maxScorePerYear) {
                                maxScorePerYear = scores[i][j];
                            }
                        }
                    }
                    System.out.println("历年来最好的成绩是" + maxScorePerYear);
                    break;
                case 4:
                    System.out.println("请输入要查询的科目code：");
                    int subject = in.nextInt();
                    double maxScoreForSubject = 0;
                    for (int i = 0; i < scores.length; i++) {
                        if (scores[i][subject] >= maxScoreForSubject) {
                            maxScoreForSubject = scores[i][subject];
                        }
                    }
                    System.out.println("历年科目" + names[subject] + "的最好成绩是" + maxScoreForSubject);
                    break;
                default:
                    System.out.println("没有该选项，程序结束");
                    cont = false;
            }
        }
    }
}
