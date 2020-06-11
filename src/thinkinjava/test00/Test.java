package thinkinjava.test00;

class ATypeName{

}

class DataOnly{
    int i;
    double d;
    boolean b;

    int storage(String s){
        return s.length() * 2;
    }

    boolean flag(){
        return true;
    }

    double natualLogBase(){
        return 2.718;
    }

    void nothing(){
        return;
    }

    void nothing2(){

    }
}

public class Test {

    public static void main(String[] args) {
        String a = "asdf";
        System.out.println(a);

        String b = new String("abc");
        System.out.println(b);

        // 自动拆装箱
        char c = 'x';
        Character ch = new Character(c);
        Character cx = c;

        {
            int x = 12;
            System.out.println(x);
            {
                int q = 96;
                System.out.println(x);
                System.out.println(q);
            }
//            System.out.println(q);
        }

        ATypeName at = new ATypeName();

        DataOnly data = new DataOnly();
        data.i = 47;

    }
}
