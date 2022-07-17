package ru.javarush.cryptoanalyser.kochemazov.commands;
import ru.javarush.cryptoanalyser.kochemazov.constants.Alphabet;
public class Encryption {
    static String alphabet = Alphabet.ALPHABET;
    String symbols = Alphabet.NUMBERS_SYMBOLS;
    private String output = "";
    public String encrypt(String input, int bias) {
        String inputLow = input.toLowerCase();
        for (int i = 0; i < inputLow.length(); i++) {
            int getIndexInAlphabet = alphabet.indexOf(inputLow.charAt(i));
            if (getIndexInAlphabet == -1) {
                this.output += " ";
            } else {
                int IndexInAlpabetWithBias = (getIndexInAlphabet + bias) % alphabet.length();
                this.output += alphabet.charAt(IndexInAlpabetWithBias);
            }
        }
        System.out.println("Файл зашифрован" + this.output);
        return this.output;
    }
    public void setOutput(String output) {
        this.output = output;
    }
    public String getOutput() {
        return output;
    }
}
