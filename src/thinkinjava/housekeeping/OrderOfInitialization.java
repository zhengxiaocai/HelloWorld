package thinkinjava.housekeeping;

// >>TODO: 初始化的顺序
// >>TODO: 在类中，定义的顺序决定了初始化的顺序。会在类加载的时候就初始化完成，包括构造器之前。

class Window {
    Window(int marker) {
        System.out.println("Window(" + marker + ")");
    }
}

class House {
    Window w1 = new Window(1); // before constructor

    House() {
        // show that we are in the constructor:
        System.out.println("House");
        w3 = new Window(33);
    }

    Window w2 = new Window(2); // after constructor

    void f() {
        System.out.println("f()");
    }

    Window w3 = new Window(3); // at end
}

public class OrderOfInitialization {

    public static void main(String[] args) {
        House h = new House();
        h.f();  // show that constructor is done
    }
}
