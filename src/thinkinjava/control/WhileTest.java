package thinkinjava.control;

public class WhileTest {
    // >>TODO: Math.random() [0, 1)
    static boolean condition(){
        boolean result = Math.random() < 0.88;
        System.out.print(result + ", ");
        return result;
    }

    public static void main(String[] args) {
        while (condition()){
            System.out.println("Inside 'while'");
        }
        System.out.println("Outside 'while'");
    }
}
