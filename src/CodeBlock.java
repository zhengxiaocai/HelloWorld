public class CodeBlock {
    public static void main(String[] args) {
        /**
         * 表达式 语句 代码块
         */
        int outer = 100;
        {
            int inner = 10;
            System.out.println("outer:" + outer + "。inner:" + inner);
        }

        int a1 = 1;
        {
            int a2 = a1 + 1;
            {
                int a3 = a2 + 1;
                System.out.println(a3);
            }
            {
                int a3 = a2 + 10;
                System.out.println(a3);
            }
            System.out.println(a2);
        }
    }
}
