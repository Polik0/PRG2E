package blackjack;

import java.util.Scanner;

public class Game {
    Player player;
    int dealerValue;
    int bet;



    public Game(Player player) {
        this.player = player;
        this.dealerValue = (int)(Math.random() * 11 + 10);
    }

    boolean takeTurn() {
        System.out.println("Liznout si dalsi kartu?");
        Scanner sc = new Scanner(System.in);

        return sc.nextLine().equals("ano");
    }

    void printInfo() {
        System.out.println("=======================================");
        System.out.println("Hrac:\t" + player.getHandValue());
        System.out.println("Dealer:\t" + dealerValue);
        System.out.println("=======================================");
    }

    void start() {
        if (wantToPlay()) {
            player.handValue = 0;
            dealerValue = (int)(Math.random() * 11 + 10);
            bet = 2 * betAmount();
            System.out.println("Hra zacala, vsazena castka je " + bet);
            System.out.println("CHEAT: dealer ma " + dealerValue);
            player.pickCard();

            while (takeTurn()) {
                player.pickCard();
                System.out.println("V ruce mas " + player.getHandValue());
            }
            if (player.getHandValue() == 21) {
                System.out.println("Hrac " + player.name + " vyhral " + bet);
                player.money += bet;
            } else if (player.getHandValue() == dealerValue) {
                player.money += bet/2;
                System.out.println("Hra dopadla remizou");
            } else if (player.getHandValue() > 21) {
                System.out.println("Hrac " + player.name + " prohrava.");
            } else if (21-player.getHandValue() > 21-dealerValue) {
                System.out.println("Hrac " + player.name + " prohrava.");
            } else {
                System.out.println("Hrac " + player.name + " vyhral " + bet);
                player.money += bet;
            }

            System.out.println("Kolo ukonceno, na ucte ma hrac " + player.name + " " + player.money);
            printInfo();
        } else {
            System.out.println("Hra ukoncena");
        }
    }

    int betAmount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kolik se vsazi?");
        int amount = sc.nextInt();
        while (!(amount > 0 && amount <= player.money)) {
            System.out.println("neplatna hodnota, zadej znovu");
            amount = sc.nextInt();
        }
        player.money -= amount;
        return amount;
    }

    boolean wantToPlay() {
        System.out.println("Chcete hrat?");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        return answer.equals("ano");
    }

    public static void main(String[] args) {
        Player james = new Player("James", 1000);
        Game blackjack = new Game(james);

        blackjack.start();
    }
}

