package oop.com.second64String;

public class LearnStringMore {
    public static void main(String[] args) {
        String content = "Orange_Apple_Banana";

        // String.toCharArray()  将 String 转化为 char[]，就可以遍历喽
        char[] chars = content.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        // >>TODO: String.split(regex) String.split(regex, limit) 这个没弄明白
        String[] strSplit = content.split("_");
        for (int i = 0; i < strSplit.length; i++) {
            System.out.println(strSplit[i]);
        }

        String[] s = content.split("_", 3);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

        // >>TODO: String.indexOf(str) 返回第一次出现的 index
        // >>TODO: String.lastIndexOf(str) 返回倒数的索引
        System.out.println(content.indexOf("a"));

        System.out.println(content.substring(content.indexOf("_") + 1));

        // >>TODO: String.contains(str) 返回是否包含子字符串
        System.out.println(content.contains("Apple"));
        System.out.println(content.contains("apple"));

        // >>TODO: String.startsWith(str); String.endsWith(str)
        System.out.println(content.startsWith("Orange"));
        System.out.println(content.endsWith("Banana"));

        // >>TODO: 比较两个字符串是否相等 String.equals(str)
        String content1 = "Orange_Apple_Banana";
        String content2 = "orange_Apple_Banana";

        System.out.println(content.equals(content1));
        System.out.println(content.equals(content2));

        // >>TODO: 忽略大小写的比较 String.equalsIgnoreCase(str)
        System.out.println(content.equalsIgnoreCase(content2));

        // >>TODO: 前后去空格
        String a = " abc ";
        System.out.println(a);
        System.out.println(a.trim());
    }
}
