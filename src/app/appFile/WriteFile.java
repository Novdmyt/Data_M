package app.appFile;

import app.data.DataN;
import app.util.Constants;

import java.io.BufferedWriter;
import java.io.FileWriter;
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
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter(file.toFile(), true));
           for(DataN data : list){
               writer.write(data.toString());
               writer.newLine();
           }
            return "Данні у файл записані ";
        } catch (IOException e) {
            return "Помилка запису данних " +  e.getMessage();
        }

    }
}
