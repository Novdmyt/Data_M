package app.appFile;

import app.data.DataN;
import app.util.Constants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class WriteFile {

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
