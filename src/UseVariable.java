import java.util.Scanner;

public class UseVariable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a;

        System.out.println("创建了一个变量a，可以给它赋值。");
        a = in.nextInt();
        System.out.println("a现在的值是" + a + "还可以继续赋值。");
        a = in.nextInt();
        System.out.println("a现在的值是" + a);
    }
}
