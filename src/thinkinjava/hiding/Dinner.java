package thinkinjava.hiding;

import thinkinjava.hiding.dessert.Cookie;

public class Dinner {

    public static void main(String[] args) {
        Cookie c = new Cookie();
//        c.bite(); >>TODO: new Cookie.bite() 是默认包权限，包外访问不了。
    }
}
