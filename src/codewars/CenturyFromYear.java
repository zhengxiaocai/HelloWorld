package codewars;

// https://www.codewars.com/kata/5a3fe3dde1ce0e8ed6000097/train/java

/**
 * 一个三元表达式就可以了
 * false ? first : second;
 * 三元表达式，选择两个返回值的时候，用的是冒号，标红加粗。
 */
public class CenturyFromYear {

    public static int century(int number) {
        return number % 100 == 0 ? number / 100 : number / 100 + 1;
    }

    public static void main(String[] args) {
        System.out.println(century(1705) == 18);
        System.out.println(century(1900) == 19);
        System.out.println(century(1601) == 17);
        System.out.println(century(2000) == 20);
    }
}
