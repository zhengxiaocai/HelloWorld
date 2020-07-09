package thinkinjava.hiding;

//>>TODO: 如果两个都是用*引入，相同名字的类，使用的时候会冲突
//>>TODO: 如果显式引用，就优先用，不会冲突。

import thinkinjava.hiding.mindviewinc.simple.*;
import thinkinjava.hiding.mindviewinc.simple.Vector;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Vector v = new Vector();
    }
}
