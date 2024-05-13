package oop;

public class Instrument {
    String type, name;
    int price;
    static int instrumentsSold = 0;

    public Instrument(String type, String name, int price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    void sellInstrument () {
        instrumentsSold++;
    }

}
