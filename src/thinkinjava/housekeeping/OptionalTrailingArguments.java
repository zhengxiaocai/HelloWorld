package thinkinjava.housekeeping;

//>>TODO: 作为可选的的结尾参数还是很实用的

public class OptionalTrailingArguments {

    static void f(int required, String... trailing) {
        System.out.println("required : " + required);
        for (String s : trailing) {
            System.out.print(s + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        f(1, "one");
        f(2, "two", "three");
        f(0);
    }
}
