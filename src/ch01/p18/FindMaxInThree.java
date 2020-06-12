package ch01.p18;

public class FindMaxInThree {

    public static void main(String[] args) {
        int a = 11;
        int b = 33;
        int c = 22;

        if (a == b && b == c) {
            System.out.println("a,b,c等大，为" + a);
        } else {
            if (a > b) {
                if (a > c) {
                    System.out.println("a最大，为" + a);
                } else {
                    if (a == c) {
                        System.out.println("a,c等大，为" + a);
                    } else {
                        System.out.println("c最大，为" + c);
                    }
                }
            } else {
                // a<=b
                if (b > c) {
                    if (a == b) {
                        System.out.println("a,b等大，为" + a);
                    } else {
                        System.out.println("b最大，为" + b);
                    }
                } else {
                    // b<=c
                    if (b == c) {
                        System.out.println("b,c等大，为" + b);
                    } else {
                        System.out.println("c最大，为" + c);
                    }
                }
            }
        }
    }
}
