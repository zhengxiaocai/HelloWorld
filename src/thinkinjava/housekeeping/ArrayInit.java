package thinkinjava.housekeeping;

import java.util.Arrays;

//>>TODO: 花括号的形式定义数组。

class PersonList {

}

public class ArrayInit {

    public static void main(String[] args) {
        Integer[] a = new Integer[]{1, 2, 3,};
        Integer[] b = {1, 2, 3,};

        PersonList[] p = {new PersonList(), new PersonList(),};

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
