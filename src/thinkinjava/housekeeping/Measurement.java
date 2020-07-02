package thinkinjava.housekeeping;

class Depth{}

public class Measurement {

    //>>TODO: 非基本类型成员变量初始化Measurement

    Depth d = new Depth();

    public static void main(String[] args) {
        System.out.println(new Measurement().d);
    }
}
