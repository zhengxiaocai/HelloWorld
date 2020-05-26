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
        double[] year1 = new double[totalSubject];

        String[] subject = new String[totalSubject];

        // 给subject赋值
        subject[YuWen] = "语文";
        subject[ShuXue] = "数学";
        subject[WaiYu] = "外语";
        subject[WuLi] = "物理";
        subject[ShengWu] = "生物";
        subject[HuaXue] = "化学";

        // 给成绩赋随机大于80数字。
        for (int i = 0; i < totalSubject; i++) {
            year1[i] = 80 + Math.random() * 20;
            System.out.println(subject[i] + "的成绩是：" + year1[i]);
        }

        double maxScore = 0;
        int maxScoreIndex = -1;
        for (int i = 0; i < totalSubject; i++) {
            if (maxScore < year1[i]) {
                maxScore = year1[i];
                maxScoreIndex = i;
            }
        }
        System.out.println("最好的科目是" + subject[maxScoreIndex] + "成绩是" + year1[maxScoreIndex]);
    }
}
