package oop;

public class ShoppingCart {
    int totalPrice, discount;

    public ShoppingCart(int totalPrice, int discount) {
        this.totalPrice = totalPrice;
        this.discount = discount;
    }

    public void add (int itemPrice) {
        totalPrice += itemPrice;
    }
    public void remove (int itemPrice) {
        if (totalPrice > itemPrice) {
            totalPrice -= itemPrice;
        } else {
            System.out.println("stala se chyba");
        }
    }
    int getPrice () {
        if (totalPrice > 1000) {
            System.out.println("dostavate slevu " + discount + "%");
            totalPrice = (int)((totalPrice * (1 + discount / 100)) * 1.21);
        } else {
            totalPrice = (int)(totalPrice*1.21);
        }
        return totalPrice;
    }
}
