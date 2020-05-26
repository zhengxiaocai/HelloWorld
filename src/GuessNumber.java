import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // 创建Scanner获取用户输入
        Scanner in = new Scanner(System.in);

        // 游戏设置
        int rangeStart = 30;
        int rangeEnd = 60;
        int guessTotal = 5;

        // 游戏统计
        int totalGameCount = 0;
        int correctGuessCount = 0;

        // 是否结束游戏
        boolean gameStop = false;

        while (!gameStop) {
            int mod = rangeEnd - rangeStart;
            if (rangeStart < 0 || rangeEnd < 0) {
                System.out.println("开始和结束必须均为正数。");
            }
            if (mod <= 1) {
                System.out.println("非法的数字范围：(" + rangeStart + ", " + rangeEnd + ")");
            }
            int bigRandom = (int) (Math.random() * rangeEnd * 100);
            int numberToGuess = bigRandom % mod + rangeStart;
            if (numberToGuess < rangeStart) {
                numberToGuess = rangeStart;
            } else if (numberToGuess > rangeEnd) {
                numberToGuess = rangeEnd;
            }

            // 剩余的猜测次数。
            int leftToGuess = guessTotal;

            boolean currentGameCounted = false;
            boolean currectGuess = false;

            System.out.println("请输入要猜测的数字，在" + rangeStart + "和" + rangeEnd + "之间。输入-1代表游戏结束。");
            while (leftToGuess > 0) {
                System.out.println("剩余猜测次数" + leftToGuess + "。请输出本次猜测的数字：");
                int guess = in.nextInt();
                if (guess == -1) {
                    gameStop = true;
                    System.out.println("用户选择结束游戏。");
                    break;
                }
                if (!currentGameCounted) {
                    totalGameCount++;
                    currentGameCounted = true;
                }
                leftToGuess--;
                if (guess > numberToGuess) {
                    System.out.println("输入数字比目标数大。");
                } else if (guess < numberToGuess) {
                    System.out.println("输入数字比目标数小。");
                } else {
                    System.out.println("输入的数字正确。");
                    currectGuess = true;
                    correctGuessCount++;
                    break;
                }
            }
            if (!currectGuess) {
                System.out.println("本次的目标数字是：" + numberToGuess);
            }
            System.out.println("您总共进行了" + totalGameCount + "次游戏，共猜对了" + correctGuessCount + "次。");
        }
    }
}
