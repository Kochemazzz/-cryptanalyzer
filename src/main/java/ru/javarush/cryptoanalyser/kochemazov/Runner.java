package ru.javarush.cryptoanalyser.kochemazov;
import ru.javarush.cryptoanalyser.kochemazov.bias.InputBias;
import ru.javarush.cryptoanalyser.kochemazov.commands.BrutForce;
import ru.javarush.cryptoanalyser.kochemazov.commands.Decryption;
import ru.javarush.cryptoanalyser.kochemazov.commands.Encryption;
import ru.javarush.cryptoanalyser.kochemazov.exceptions.MainExceptionRun;
import ru.javarush.cryptoanalyser.kochemazov.file.FileLoad;

import java.io.IOException;
import java.nio.file.Path;
import java.util.InputMismatchException;
public class Runner {
    public static void main(String[] args) {

        try {
            FileLoad.setPathInput();
            InputBias.setKey();
            Encryption.encrypt(FileLoad.ReadLineString,InputBias.getKey());
            Decryption.decrypt(Encryption.getOutput(),InputBias.getKey());
            BrutForce.BrutForcing(Encryption.getOutput());
        }
        catch (InputMismatchException e) {
            System.out.println("Ошибка ввода");
        }
        catch (MainExceptionRun e) {
            System.out.println("Что-то пошло не так");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
