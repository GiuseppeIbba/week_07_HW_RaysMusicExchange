package accessories.percussions;

import accessories.Accessory;

public class DrumStick extends Accessory {

    String material;

    public DrumStick(String partName, String brand, String partFor, String type, double buyingPrice, double sellingPrice, String material) {
        super(partName, brand, partFor, type, buyingPrice, sellingPrice);
        this.material = material;
    }

    public String getMaterial() {
        return this.material;
    }
}
