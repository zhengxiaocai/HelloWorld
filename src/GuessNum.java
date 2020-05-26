public class GuessNum {
    public static void main(String[] args) {
        double randNum = 0;

        // 要生成一个小于0.5的数，循环才会继续。
        while (randNum < 0.5) {
            // 使用Java中的Math.random()方法，生成0~1的随机数。
            randNum = Math.random();
            System.out.println(randNum);
        }

        int rangeStart = 30;
        int rangeEnd = 90;

        int mod = rangeEnd - rangeStart;

        if (rangeStart == 0 || rangeEnd == 0) {
            System.out.println("开始和结束必须是正数或者是0");
        }

        if (mod <= 1) {
            System.out.println("非法数字范围：" + mod);
        }

        for (int i = 0; i < 10; i++) {
            int bigRangeNum = (int) (Math.random() * rangeEnd * 100);

            int numToGuess = bigRangeNum % mod + rangeStart;

            if (numToGuess < rangeStart) {
                numToGuess = rangeStart;
            } else if (numToGuess > rangeEnd) {
                numToGuess = rangeEnd;
            }

            System.out.println(numToGuess);
        }
    }
}
