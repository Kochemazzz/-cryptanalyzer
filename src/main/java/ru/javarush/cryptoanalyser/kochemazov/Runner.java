package ru.javarush.cryptoanalyser.kochemazov;
import ru.javarush.cryptoanalyser.kochemazov.bias.InputBias;
import ru.javarush.cryptoanalyser.kochemazov.commands.Decryption;
import ru.javarush.cryptoanalyser.kochemazov.commands.Encryption;
import ru.javarush.cryptoanalyser.kochemazov.file.FileLoad;

import java.io.IOException;
import java.nio.file.Path;
public class Runner {
    public static void main(String[] args) throws IOException {
        InputBias inputBias = new InputBias();
        inputBias.setKey();
        FileLoad fileLoad = new FileLoad();
        fileLoad.setPath();
        Path path = fileLoad.getPath();
        fileLoad.ReadFile(path);
        Encryption encrypt = new Encryption();
        encrypt.encrypt(fileLoad.getRead(),inputBias.getKey());
        Decryption decrypt = new Decryption();
        decrypt.decrypt(encrypt.getOutput(),inputBias.getKey());


    }
}
