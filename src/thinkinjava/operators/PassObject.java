package thinkinjava.operators;

class Letter {
    char c;
}

public class PassObject {
    static void f(Letter y) {
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter letter = new Letter();
        letter.c = 'a';
        System.out.println("letter.c: " + letter.c);
        PassObject.f(letter);
        System.out.println("letter.c: " + letter.c);
    }
}
