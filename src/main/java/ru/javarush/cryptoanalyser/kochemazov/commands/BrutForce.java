package ru.javarush.cryptoanalyser.kochemazov.commands;
import ru.javarush.cryptoanalyser.kochemazov.constants.Alphabet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class BrutForce {
    static String alphabet = Alphabet.ALPHABET;
    String symbols = Alphabet.NUMBERS_SYMBOLS;
    String output;
    List<String> outputList = new ArrayList<>();
    public List<String> BrutForcing(String input) {
        String inputLow = input.toLowerCase();
        for (int bias = 0; bias < alphabet.length(); bias++) {
            for (int i = 0; i < 33; i++) {
                int getIndexInAlphabet = alphabet.indexOf(inputLow.charAt(i));
                if (getIndexInAlphabet == -1) {
                    this.output += " ";
                } else {
                    int indexInAlpabetWithBias = (getIndexInAlphabet - bias) % alphabet.length();
                    if (indexInAlpabetWithBias == -1) {
                        output += 'z';
                    } else if (indexInAlpabetWithBias < -1) {
                        output += alphabet.charAt(indexInAlpabetWithBias + alphabet.length());
                    } else {
                        output += alphabet.charAt(indexInAlpabetWithBias);
                    }
                }
            }
            System.out.println(output);
            output = output + ";";
            outputList.add(output);
            output = "";
        }

        return outputList;
    }
}