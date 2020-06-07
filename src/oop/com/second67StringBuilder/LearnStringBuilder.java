package oop.com.second67StringBuilder;

public class LearnStringBuilder {

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("ABC");
        StringBuilder strBuilder = new StringBuilder();

        long longVal = 123456789;

        strBuilder.append(true).append("abc").append(longVal);

        System.out.println(str);
        System.out.println(strBuilder);
        System.out.println(strBuilder.reverse().toString());
        System.out.println(strBuilder.toString());

        // [0, 4)
        System.out.println(strBuilder.delete(0, 4));

        System.out.println(strBuilder.insert(3, "LLLL").toString());
    }
}
