package oop.com.second63;

public class LearnString {

    public static void main(String[] args) {
        String content = "abc123ABC";

        // String的length()是个方法，不是属性
        System.out.println(content.length());

        // 大小写转换
        System.out.println(content.toLowerCase());

        System.out.println(content.toUpperCase());
    }
}
