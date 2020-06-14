package thinkinjava.operators;

class Value{
    int i;

    public boolean equals(Object obj){
        if (obj instanceof Value){
            return i == ((Value)obj).i;
        }
        return false;
    }
}

public class EqualsMethod2 {

    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 47;
        System.out.println(v1.equals(v2));
    }
}
