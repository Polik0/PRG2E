package oop;

public class ArcadeGame {
    private int score, players, highestScore;
    private final int MAX_PLAYERS = 3;

    public ArcadeGame() {
        this.score = 0;
        this.players = 0;
        this.highestScore = 0;
    }
    public int getHighestScore() {
        return highestScore;
    }
    public void increaseScore (int score) {
        if (players > 0 && score > 0) {
            this.score += score;
            if (this.score > highestScore) {
                highestScore = this.score;
            }
        } else {
            System.out.println("Chyba");
        }
    }
    public void decreaseScore (int score) {
        if (players > 0 && score <= this.score) {
            this.score -= score;
        } else {
            this.score = 0;
        }
    }
    public boolean join () {
        if (players == 0) {
            players++;
            return true;
        } else {
            System.out.println("chyba");
            return false;
        }
    }

    public boolean logOut () {
        if (players > 0) {
            players--;
            return true;
        } else {
            System.out.println("nikdo nehraje");
            return false;
        }
    }

}
