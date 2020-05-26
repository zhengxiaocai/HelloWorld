import java.util.Scanner;

public class ScannerIn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("你叫什么名字呀？");

        String name = in.nextLine();

        System.out.println("你今年几岁了呀？");

        int age = in.nextInt();

        System.out.println(name + age + "岁了！");
    }
}
