package thinkinjava.control;

import java.util.Random;

public class VowelsAndConsonants {
    // 用switch判断随机字母是否是元音
    public static void main(String[] args) {
        Random random = new Random(47);
        for (int i = 0; i < 100; i++) {
            int c = 'a' + random.nextInt(26);
            System.out.print((char) c + ",\t" + c + "\t:\t");
            switch(c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("vowel");
                    break;
                case 'y':
                case 'w':
                    System.out.println("sometimes vowel");
                    break;
                default:
                    System.out.println("Consonant");
            }
        }
    }

}
