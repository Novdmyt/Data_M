package app.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Data {

    public static List<String > getData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведіть назву продукту ");
        String name = scanner.nextLine();
        System.out.println("Ведіть ціну продукту");
        String price = scanner.nextLine();
        List<String> list = new ArrayList<>();
        list.add(name);
        list.add(price);
         return list;
    }
}
