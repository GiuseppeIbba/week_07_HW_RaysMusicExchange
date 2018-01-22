package accessories.strings;

public class Pickup {


    private String partName;
    private String brand;
    private String partFor;
    private String type;
    private double buyingPrice;
    private double sellingPrice;

    public Pickup(String partName, String brand, String partFor, String type, double buyingPrice, double sellingPrice) {
        this.partName = partName;
        this.brand = brand;
        this.partFor = partFor;
        this.type = type;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getPartName() {
        return this.partName;
    }

    public String getPartFor() {
        return this.partFor;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getType() {
        return this.type;
    }

    public double getBuyingPrice() {
        return this.buyingPrice;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

}
