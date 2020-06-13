package oop.com.second73;

public class Phone extends MerchandiseV2 {

    private double screenSize;
    private double cpuHz;
    private int storageG;
    private int memoryG;
    private String brand;
    private String os;

    private static int MAX_BUY_ONE_ORDER = 2;

    public Phone(String name, String id, int count, double soldPrice, double purchasePrice,
                 double screenSize, double cpuHz, int storageG, int memoryG, String brand, String os) {
        super(name, id, count, soldPrice, purchasePrice);
        this.screenSize = screenSize;
        this.cpuHz = cpuHz;
        this.storageG = storageG;
        this.memoryG = memoryG;
        this.brand = brand;
        this.os = os;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("screenSize: " + screenSize + "cpuHz: " + cpuHz);
    }

    public String getBrand(){
        return brand;
    }
}
