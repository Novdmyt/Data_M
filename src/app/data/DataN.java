package app.data;

public class DataN {
    private final  String name;
    private final String  price;


    public DataN(String name, String price){
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return " Назва продукту " + name + ", ціна " + price;
    }
}
