package oop.com.second64String;

public class LearnString {
    public static void main(String[] args) {
        String content = "123abcABC";

        // String.length() 是方法，不是属性
        System.out.println(content.length());

        // 大写 小写 String.toUpperCase()  String.toLowerCase()
        System.out.println(content.toLowerCase());
        System.out.println(content.toUpperCase());

        // 不管调用啥方法，String本身不会变。
        System.out.println(content);

        // 根据索引看字符 String.charAt(index)
        System.out.println(content.charAt(3));

        // >>TODO:字符串切割 String.substring(start)  String.substring(start, end) ==> [start, end)
        System.out.println(content.substring(3));
        System.out.println(content.substring(3, 5));


    }
}
