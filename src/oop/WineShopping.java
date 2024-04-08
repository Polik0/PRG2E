package oop;

public class WineShopping {
    public static void main(String[] args) {
        WineShop winery = new WineShop();
        winery.pricePerBottle = 350;
        winery.balance = 5000;
        winery.sell(20);

        winery.buy(15);
        winery.printBalance();
        winery.sell(10);
        winery.printBalance();
    }
}
