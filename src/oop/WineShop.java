package oop;

public class WineShop {
        int pricePerBottle;
        int year;
        int count;
        int balance;
        public final int BUY_PRICE = 200;
        boolean sell(int count) {
            if (this.count > count) {
                balance += count * pricePerBottle;
                this.count -= count;
                System.out.println("uspesne prodano");
                return true;
            } else {
                System.out.println("nejde nic");
                return false;
            }
        }

        boolean buy(int count) {
            if (balance > BUY_PRICE * count) {
                balance -= BUY_PRICE * count;
                this.count += count;
                return true;
            } else {
                System.out.println("no money");
                return false;
            }
        }

        void printBalance() {
            System.out.println("Prave je na ucte " + balance + " Kc");
            System.out.println("na skalde: " + count);
        }
    }

