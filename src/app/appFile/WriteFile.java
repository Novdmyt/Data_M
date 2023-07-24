package app.appFile;

import app.data.DataN;
import app.util.Constants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class WriteFile {

    public static String createFile(String nameFile){
        Path file = Path.of(Constants.BASE_IN_PATH + nameFile + ".txt");
        try {
            Files.createFile(file);
            return "Файл створено ";
        } catch (IOException e) {
            return"Такий файл існує. " + e.getMessage();
        }
    }

    public static String writeFile(String nameFile, ArrayList<DataN> list){
        Path file = Path.of(Constants.BASE_IN_PATH + nameFile + ".doc");
        try {
            String content = String.valueOf(list);
            byte[] text = content.getBytes();
            Files.write(file, text);
            return "Данні у файл записані ";
        } catch (IOException e) {
            return "Помилка запису данних " +  e.getMessage();
        }

    }
}
