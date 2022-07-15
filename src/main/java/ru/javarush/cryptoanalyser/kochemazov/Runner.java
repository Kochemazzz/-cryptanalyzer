package ru.javarush.cryptoanalyser.kochemazov;
import ru.javarush.cryptoanalyser.kochemazov.bias.InputBias;
import ru.javarush.cryptoanalyser.kochemazov.file.FileLoad;
public class Runner {
    public static void main(String[] args) {
        InputBias inputBias = new InputBias();
        inputBias.setKey();
        FileLoad fileLoad = new FileLoad();
        fileLoad.setPath();

    }
}
