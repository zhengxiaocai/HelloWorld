package ch01.p20;

public class SimpleFor {

    public static void main(String[] args) {
        char a = 'A';
        int num = (int) a;
        for (int i = 0; i < 26; i++) {
            System.out.println((num + i) + "\t" + ((char) (num + i)));
        }
    }
}
