package thinkinjava.control;

public class TestWithReturn {
    static int test(int testVal, int target){
        if (testVal > target) {
            return 1;
        }
        if (testVal < target){
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(test(5, 3));
        System.out.println(test(3, 5));
        System.out.println(test(5, 5));
    }
}
