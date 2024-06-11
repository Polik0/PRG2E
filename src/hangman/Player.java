package hangman;

public class Player {
    String name;
    int attempts;
    final int DEFAULT_ATTEMPTS = 12;

    public Player(String name) {
        this.name = name;
        resetAttempts();
    }

    void resetAttempts(){
        attempts = DEFAULT_ATTEMPTS;
    }

}