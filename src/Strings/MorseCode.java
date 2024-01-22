package Strings;

public class MorseCode {
    public static void main(String[] args) {
        String[] morseCodes = {
                ".-",   // A
                "-...", // B
                "-.-.", // C
                "-..",  // D
                ".",    // E
                ".._.", // F
                "--.",  // G
                "....", // H
                "..",   // I
                ".---", // J
                "-.-",  // K
                ".-..", // L
                "--",   // M
                "-.",   // N
                "---",  // O
                ".--.", // P
                "--.-", // Q
                ".-.",  // R
                "...",  // S
                "-",    // T
                "..-",  // U
                "...-", // V
                ".--",  // W
                "-..-", // X
                "-.--", // Y
                "--.."  // Z
        };

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String text = "Yo mama";
        String allLower = text.toLowerCase();
        String res = "";

        for (int i = 0; i < text.length(); i++) {
            char currentChar = allLower.charAt(i);
            for (int j = 0; j < alphabet.length; j++) {
                if (currentChar == alphabet[j]) {
                    res += morseCodes[j] + "|";
                } else if (currentChar == ' '){
                    res += "*space*|";
                    break;
                }
            }
        }
        System.out.println(text);
        System.out.println(res);
    }
}
