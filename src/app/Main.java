package app;

import app.data.DataN;

import java.util.ArrayList;
import java.util.Scanner;

import static app.appFile.WriteFile.writeFile;
import static app.data.Data.getData;

public class Main {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведіть назву файлу");
        String name = scanner.nextLine();
        System.out.println(writeFile(name, (ArrayList<DataN>) getData()));
    }
}
