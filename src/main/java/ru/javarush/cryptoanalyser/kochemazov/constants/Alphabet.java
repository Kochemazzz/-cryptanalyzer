package ru.javarush.cryptoanalyser.kochemazov.constants;
public class Alphabet {

    private static final String RUSSIAN_ALPHABET_SMALL = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    private static final String RUSSIAN_ALPHABET_BIG = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    private static final String ENGLISH_ALPHABET_SMALL = "abcdefghijklmnopqrstuvwxyz";
    private static final String ENGLISH_ALPHABET_BIG = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SYMBOLS = ".,:;…—?!()<>{}[]«»/\"\"-+*&%$@=#";

    private static final String ALPHABET = RUSSIAN_ALPHABET_SMALL+ RUSSIAN_ALPHABET_BIG+
            ENGLISH_ALPHABET_SMALL+ENGLISH_ALPHABET_BIG+
            NUMBERS+SYMBOLS;
    public static void main(String[] args) {
        System.out.println(ALPHABET.length());
    }
}
