package ru.javarush.cryptoanalyser.kochemazov;
import ru.javarush.cryptoanalyser.kochemazov.bias.InputBias;
import ru.javarush.cryptoanalyser.kochemazov.commands.Encryption;
import ru.javarush.cryptoanalyser.kochemazov.file.FileLoad;

import java.io.IOException;
import java.nio.file.Path;
public class Runner {
    public static void main(String[] args) throws IOException {
        InputBias inputBias = new InputBias();
        inputBias.setKey();
        int a = inputBias.getKey();
        FileLoad fileLoad = new FileLoad();
        fileLoad.setPath();
        Path path = fileLoad.getPath();
        fileLoad.ReadFile(path);
        Encryption encrypt = new Encryption();
        encrypt.encrypt(fileLoad.getRead(),inputBias.getKey());


    }
}
