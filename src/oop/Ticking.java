package oop;

import java.nio.channels.ClosedChannelException;

public class Ticking {
    public static void main(String[] args) {
        Clock basic = new Clock(0, 0, 0, true);

        while (basic.hours < 3) {
            basic.tick();
            basic.printTme();
        }

        Clock dalsi  = new Clock(16, 30, 0, true);
        System.out.println("Casy:");
        dalsi.printTme();
        basic.printTme();
        System.out.println("Rozdil: " + basic.difference(dalsi));
    }
}
