package instruments;

import interfaces.IPlayable;
import interfaces.ISell;

public class Instrument implements ISell {

    private String model;
    private String brand;
    private String type;
    private double buyingPrice;
    private double sellingPrice;

    public Instrument (String model, String brand, String type, double buyingPrice, double sellingPrice) {
        this.model = model;
        this.brand = brand;
        this.type = type;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getModel() {
        return this.model;
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

    public double markup() {
        double margin = this.getSellingPrice() - this.getBuyingPrice();
        double markup = (margin / this.getBuyingPrice()) * 100;
        double markupPercentage = Math.round(markup * 100.0) / 100.0;
        return markupPercentage;
    }

    public double calcuateMarkup() {
        return markup();
    }
}
