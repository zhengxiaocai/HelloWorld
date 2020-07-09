package thinkinjava.reuse;

class WaterSource {
    private String s;

    WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}

public class SprintlerSystem {
    private String value1, value2, value3, value4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    @Override
    public String toString() {
        return
                "value1 = " + value1 + "\t" +
                        "value2 = " + value2 + "\t" +
                        "value3 = " + value3 + "\t" +
                        "value4 = " + value4 + "\n" +
                        "i = " + i + "\t" + "f = " + f + "\t" +
                        "source = " + source;
    }

    public static void main(String[] args) {
        SprintlerSystem sprintler = new SprintlerSystem();
        System.out.println(sprintler);
    }

}
