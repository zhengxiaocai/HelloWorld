package oop.com.second73;

public class ShellColorChangePhone extends Phone {

    private boolean enableShellColorChange;

    public ShellColorChangePhone(String name, String id, int count, double soldPrice, double purchasePrice,
                                 double screenSize, double cpuHz, int storageG, int memoryG, String brand,
                                 String os, boolean enableShellColorChange) {
        super(name, id, count, soldPrice, purchasePrice, screenSize, cpuHz, storageG, memoryG, brand, os);
        enableShellColorChange = false;
    }

    public boolean getEnableShellColorChange(){
        return enableShellColorChange;
    }

    public void setEnableShellColorChange(boolean enableShellColorChange){
        this.enableShellColorChange = enableShellColorChange;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("enableShellColorChange: " + enableShellColorChange);
    }
}
