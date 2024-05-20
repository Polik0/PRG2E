package blackjack;

public class Player {
    String name;
    int money, handValue;

    public Player(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void pickCard() {
        int cardPicked = (int)(Math.random() * 13 + 1);
        if (cardPicked >= 10) {
            cardPicked = 10;
        }
        System.out.println("Lizl sis kartu");
        handValue += cardPicked;
    }

    public int getHandValue() {
        return handValue;
    }


}
