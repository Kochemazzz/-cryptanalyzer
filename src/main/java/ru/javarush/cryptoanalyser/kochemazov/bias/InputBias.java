package ru.javarush.cryptoanalyser.kochemazov.bias;
import java.util.Scanner;
public class InputBias {
    private static int KEY = 0;
    private static final Scanner scanner = new Scanner(System.in);
    public static void setKey() {
        while (true) {
            System.out.println("Please, input bias!");
            System.out.println();
            KEY = scanner.nextInt();
            if (KEY > 0 && KEY < 33) {
                System.out.println("bias add");
                break;
            } else {
                System.out.println("bias not supported");
            }
        }
    }
    public static int getKey() {
        System.out.println("number of bias: " + KEY);
        return KEY;
    }

}

