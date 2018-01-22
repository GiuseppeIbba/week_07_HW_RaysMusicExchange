import interfaces.ISellable;

public class Product implements ISellable {


    private String brand;
    private String type;
    private double buyingPrice;
    private double sellingPrice;

    public Product(String brand, String type, double buyingPrice, double sellingPrice) {
        this.brand = brand;
        this.type = type;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }
}