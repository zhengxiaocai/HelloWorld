package thinkinjava.housekeeping;

//>>TODO: Enum.values() 按顺序排列的数组
//>>TODO: Enum.value.ordinal() 当前项的index 索引

public class EnumOrder {
    public static void main(String[] args) {
        for (Spiciness s : Spiciness.values()) {
            System.out.println(s + ", ordinal " + s.ordinal());
        }
    }
}
