package ru.javarush.cryptoanalyser.kochemazov.file;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
public class FileLoad {
    private static Path pathInput;
    public static String ReadLineString ;
    private static final Scanner scanner = new Scanner(System.in);
    public static Path getPathInput() {
        return FileLoad.pathInput;
    }
    public static void setPathInput(Path pathInput) {
        while (true) {
            if (Files.exists(pathInput)) {
                FileLoad.pathInput = pathInput;
                System.out.println("path in a local");
                System.out.println("done");
                break;
            } else {
                System.out.println("Path is a wrong!");
            }
        }
    }
    public static void setPathInput() throws IOException {
        while (true) {
            String inputString = scanner.nextLine();
            Path newPath = Path.of(inputString);
            if (Files.exists(newPath)) {
                System.out.println("File on board!");
                FileLoad.pathInput = newPath;
                FileLoad.ReadLineString = String.valueOf(Files.readAllLines(FileLoad.pathInput));
                break;
            } else {
                System.out.println("Not file in local directory");
            }
        }
    }
}
