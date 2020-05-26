public class ManyIf {
    public static void main(String[] args) {
        /**
         * 任意三个数值，比较大小。
         */
        int a = 9;
        int b = 10;
        int c = 10;

        if (a == b && b == c) {
            System.out.println("a,b,c一样大，为" + a);
        } else {
            if (a > b) {
                if (a > c) {
                    System.out.println("a是最大值，为" + a);
                } else {
                    if (a == c) {
                        System.out.println("a,c是最大值，为" + a);
                    } else {
                        System.out.println("c是最大值，为" + c);
                    }
                }
            } else {
                // a<=b
                if (b > c) {
                    if (a == b) {
                        System.out.println("a,b是最大值，为" + b);
                    } else {
                        System.out.println("b是最大值，为" + b);
                    }

                } else {
                    // a<=b b<=c
                    if (b==c){
                        System.out.println("b,c是最大值，为" + b);
                    }else {
                        System.out.println("c是最大值，为" + c);
                    }
                }
            }
        }
    }
}