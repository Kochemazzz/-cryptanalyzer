package ru.javarush.cryptoanalyser.kochemazov.bias;
import java.util.Scanner;
public class InputBias {
    private int KEY = 0;
    private final Scanner scanner = new Scanner(System.in);
    public void setKey() {
        while (true) {
            System.out.println("Введите пожалуйста сдвиг");
            System.out.println();
            this.KEY = scanner.nextInt();
            if (this.KEY > 0 && this.KEY < 33) {
                System.out.println("Сдвиг задан правильно");
                break;
            } else {
                System.out.println("Сдвиг задан неправильно");
            }
        }
    }
    public int getKey() {
        System.out.println("Номер сдвига: " + this.KEY);
        return this.KEY;
    }

}

