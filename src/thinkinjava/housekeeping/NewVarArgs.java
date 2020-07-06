package thinkinjava.housekeeping;

//>>TODO: 可变参数，不用显示声明数组了。

public class NewVarArgs {

    static void printArray(Object... args) {
        for (Object obj : args) {
            System.out.print(obj + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(47, (float) 3.14, 11.11);
        printArray(47, 3.14F, 11.11);
        printArray("one", "two", "three");
        printArray(new A(), new A(), new A());

        printArray((Object[]) new Integer[]{1, 2, 3, 4});
        printArray();
    }
}
