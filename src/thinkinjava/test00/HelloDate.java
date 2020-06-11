package thinkinjava.test00;

import java.util.*;

public class HelloDate {

    public static void main(String[] args) {
        System.out.println("It's: ");
        System.out.println(new Date());

        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}
