public class PrintChars {
    public static void main(String[] args) {
        /**
         * A 65
         * a 97
         */
        char ch = 'a';
        int num = ch;
        for (int i = 0; i < 26; i++) {
            System.out.println(num + "\t" + (char) num++);
        }
    }
}
