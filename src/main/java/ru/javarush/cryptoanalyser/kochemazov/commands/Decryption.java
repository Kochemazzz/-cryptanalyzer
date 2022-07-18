package ru.javarush.cryptoanalyser.kochemazov.commands;
import ru.javarush.cryptoanalyser.kochemazov.constants.Alphabet;
public class Decryption {
    static String alphabet = Alphabet.ALPHABET;
    String symbols = Alphabet.NUMBERS_SYMBOLS;
    static String output = " ";
    public static void decrypt(String input, int bias) {
        String inputLow = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            int getIndexInAlphabet = alphabet.indexOf(inputLow.charAt(i));
            if (getIndexInAlphabet == -1) {
                output += " ";
            } else {
                int IndexInAlpabetWithBias = (getIndexInAlphabet - bias) % alphabet.length();
                output += alphabet.charAt(IndexInAlpabetWithBias);
            }
        }
        System.out.println(output);
    }
}
