package ru.javarush.cryptoanalyser.kochemazov.file;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLOutput;
import java.util.Scanner;
public class FileLoad {
    private Path path;
    private final Scanner scanner = new Scanner(System.in);
    private String newPath;
    public void setPath() {
        while (true) {
            this.newPath = scanner.nextLine();
            this.path = Path.of(this.newPath);
            if (Files.exists(this.path)) {
                System.out.println("Файл существует");
                break;
            } else {
                System.out.println("Файл не существует");
            }
        }
    }
    public void setPath(String path) {
        while (true) {
            this.newPath = path;
            this.path = Path.of(this.newPath);
            if (Files.exists(this.path)) {
                System.out.println("Файл существует");
                break;
            } else {
                System.out.println("Файл не существует");
            }
        }
    }
    public Path getPath() {
        return this.path;
    }
    public Path getPath(Path path) {
        return this.path = path;
    }
}
