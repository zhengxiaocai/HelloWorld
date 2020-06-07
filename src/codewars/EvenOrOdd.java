package codewars;

public class EvenOrOdd {
    public static String even_or_odd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static String evenOrOdd(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        System.out.println(evenOrOdd(5));
        System.out.println(evenOrOdd(6));
    }
}
