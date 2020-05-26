public class BitShift {
    public static void main(String[] args) {
        /**
         * 位移运算符：
         * >>   符号位不动，其余向右移位，空出来的位，正数补0 负数补1；
         * >>>  全部位右移，左边补零。
         * <<   全部左移，右边补零。会变长。
         */
        int a = 0x400;
        System.out.println(a);
        System.out.println(a >> 1);
        System.out.println(a >> 2);

        System.out.println(a << 1);
        System.out.println(a << 2);

        int b = -0x400;
        System.out.println(b);
        System.out.println(b >> 1);
        System.out.println(b >> 2);

        System.out.println(b << 1);
        System.out.println(b << 2);

        System.out.println(b >>> 1);
        System.out.println(b >>> 2);
    }
}
