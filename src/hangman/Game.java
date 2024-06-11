package hangman;

import java.util.ArrayList;

public class Game {

    String secret;
    ArrayList<String> checked;
    final String[] POOL = {"papuce", "srst", "nejkulatoulinkatejsi", "kavovar", "chirurgie"};
    Player p;
    Reader inputReader;

    public Game(Player p, Reader inputReader) {
        this.p = p;
        this.inputReader = inputReader;
    }

    void printState() {
        for (int i = 0; i < secret.length(); i++) {
            char ch = secret.charAt(i);
            if (checked.contains(ch)) {
                System.out.println(ch);
            } else {
                System.out.println("-");
                p.attempts--;
            }
        }
    }
    /**
     * Vygeneruje: nahodne slovo z poolu
     * Vycisti: pocet pokusu u hrace, vsechna zadana pismena
     */
    void setupGame(){
        p.resetAttempts();
        checked = new ArrayList<>();
        secret = pickRandomWord();
    }

    String pickRandomWord(){
        int randomIndex = (int) (Math.random() * POOL.length);
        System.out.println("CHEAT: " + POOL[randomIndex]);
        return POOL[randomIndex];
    }



    void makeAGuess(){
        System.out.println("Pokusu zbyva: " + p.attempts);
        System.out.println("Zadej pismeno k uhadnuti: ");
        String guess = inputReader.readInput();
        if (secret.contains(guess)){
            System.out.println("Pismeno uhadnuto!");
            checked.add(guess);
        } else {
            System.out.println("Nespravna volba");

        }
    }

    void startGame(){
        System.out.println("Spustit hru?");
        if (inputReader.readInput().equals("y")){
            setupGame();
            System.out.println("Hra zacala");
            while(p.attempts > 0 && checked.size() < secret.length()){
                makeAGuess();
            }
        }
        System.out.println("Hra ukoncena");
    }
}