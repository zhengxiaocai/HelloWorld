package thinkinjava.control;

public class ForInString {
    // >>TODO: String.toCharArray() 将string转换为一个字符数组返回
    public static void main(String[] args) {
        for (char c : "An African Swallow".toCharArray()) {
            System.out.print(c + " ");
        }
    }
}
