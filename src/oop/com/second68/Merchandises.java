package oop.com.second68;

public class Merchandises {

    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;

    public double buy(int count){
        if (this.count < count){
            return -1;
        }
        return this.count -= count;
    }

}
