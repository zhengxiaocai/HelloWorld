package thinkinjava.housekeeping;

public class InitialValues {

    //>>TODO:成员变量会有默认类型的初始化。

    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    InitialValues reference;

    void printInitialValues(){

        System.out.println("Data type initial value");
        System.out.println("boolean : " + t);
        System.out.println("char : " + c);
        System.out.println("byte : " + b);
        System.out.println("short : " + s);
        System.out.println("int : " + i);
        System.out.println("long : " + l);
        System.out.println("float : " + f);
        System.out.println("double : " + d);
        System.out.println("reference : " + reference);
    }

    public static void main(String[] args) {

        // >>TODO:局部变量不初始化的时候，会直接报错
//        int i;
//        i++;

        new InitialValues().printInitialValues();
    }
}
