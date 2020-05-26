public class BitCalc {
    public static void main(String[] args) {
        /**
         * 按位运算：
         * &    两边都是1，才是1；
         * ^    两边不一样，就是1；
         * ~    单个倒转。
         */
        int a = 0xF8;   //二进制 1111 1000
        int b = 0xF4;   //二进制 1111 0100
        int c = 0xFF;   //二进制 1111 1111

        System.out.println(a & b);  // 1111 0000
        System.out.println(a | b);  // 1111 1100
        System.out.println(a ^ b);  // 0000 1100

        System.out.println(~c);     // 0000 0000
    }
}
