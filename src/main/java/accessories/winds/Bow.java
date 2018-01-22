package accessories.winds;

import accessories.Accessory;

public class Bow extends Accessory {

    private String material;

    public Bow(String partName, String brand, String partFor, String type, double buyingPrice, double sellingPrice, String material) {
        super(partName, brand, partFor, type, buyingPrice, sellingPrice);
        this.material = material;
    }

    public String getMaterial() {
        return this.material;
    }
}
