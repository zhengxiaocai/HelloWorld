package thinkinjava.housekeeping;

public class Flower {

    int petalCount = 0;
    String s = "initial value";

    Flower(int petals){
        petalCount = petals;
        System.out.println("Constructor w/ int arg only, petalCount = " + petalCount);
    }

    Flower(String ss){
        System.out.println("Constructor w/ String arg only, s = " + ss);
        s = ss;
    }

    Flower(String s, int petals){
        this(petals);
//        this(s); >>TODO: 最多调用一个。因为，在构造器里调用构造器，必须放在第一行。
        this.s = s;
        System.out.println("String & int args");
    }

    Flower(){
        this("hi", 47);
        System.out.println("no-arg constructor");
    }

    void printPetalCount(){
//        this(); >>TODO:在构造器外不能使用。
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}
