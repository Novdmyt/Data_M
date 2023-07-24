package app.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Data {

    public static List<DataN> getData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведіть назву продукту ");
        String name = scanner.nextLine();
        System.out.println("Ведіть ціну продукту");
        String price = scanner.nextLine();
        List<DataN> list = new ArrayList<>();
        list.add(new DataN(name, price));
        return list;
    }



}
