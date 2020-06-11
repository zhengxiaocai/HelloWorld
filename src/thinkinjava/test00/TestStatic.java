package thinkinjava.test00;

public class TestStatic {
    static int i = 47;

    static void increamentable(){
        i++;
    }

    public static void main(String[] args) {
        TestStatic ts01 = new TestStatic();
        TestStatic ts02 = new TestStatic();

        System.out.println(ts01.i);
        System.out.println(ts02.i);

        TestStatic.i++;

        System.out.println(ts01.i);
        System.out.println(ts02.i);

        TestStatic.increamentable();

        System.out.println(TestStatic.i);
    }
}
