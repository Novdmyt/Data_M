package app.appFile;

import app.util.Constants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class WriteFile {

    public static String writeFile(String nameFile, ArrayList<String> list){
        Path file = Path.of(Constants.BASE_IN_PATH + nameFile + ".txt");
        try {
            String content = String.join(" ,", list);
            byte[] text = content.getBytes();
            Files.write(file, text);
            return "Данні у файл записані ";
        } catch (IOException e) {
            return "Помилка запису данних " +  e.getMessage();
        }

    }
}
