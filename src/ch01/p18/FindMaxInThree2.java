package ch01.p18;

public class FindMaxInThree2 {

    public static void main(String[] args) {
        int a = 99;
        int b = 99;
        int c = 99;

        if (a == b && b == c) {
            System.out.println("a,b,c等大，为" + a);
        } else if (a > b && a > c) {
            System.out.println("a最大，为" + a);
        } else if (b > c && b > a) {
            System.out.println("b最大，为" + b);
        } else if (c > a && c > b) {
            System.out.println("c最大，为" + c);
        } else if (a == b && a > c) {
            System.out.println("a,b等大，为" + a);
        } else if (a == c && a > b) {
            System.out.println("a,c等大，为" + c);
        } else if (b == c && b > a) {
            System.out.println("b,c等大，为" + b);
        }
    }
}
