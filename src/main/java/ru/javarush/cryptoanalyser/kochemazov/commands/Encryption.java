package ru.javarush.cryptoanalyser.kochemazov.commands;
import ru.javarush.cryptoanalyser.kochemazov.constants.Alphabet;
public class Encryption {
    static String alphabet = Alphabet.ALPHABET;
    String symbols = Alphabet.NUMBERS_SYMBOLS;
    private static String output = "";
    public static void encrypt(String input, int bias) {
        String inputLow = input.toLowerCase();
        for (int i = 0; i < inputLow.length(); i++) {
            int getIndexInAlphabet = alphabet.indexOf(inputLow.charAt(i));
            if (getIndexInAlphabet == -1) {
                output += " ";
            } else {
                int IndexInAlpabetWithBias = (getIndexInAlphabet + bias) % alphabet.length();
                output += alphabet.charAt(IndexInAlpabetWithBias);
            }
        }
        System.out.println("Файл зашифрован" + output);
    }
    public static void setOutput(String output) {
        Encryption.output = output;
    }
    public static  String getOutput() {
        return output;
    }
}
