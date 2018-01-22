package instruments.winds.airreservoirs;

import instruments.Instrument;

public class Zampogna extends Instrument {

    private int numberOfDroneReeds;
    private String size;

    public Zampogna(String model, String brand, String type, double buyingPrice, double sellingPrice, String sound, int numberOfDroneReeds, String size) {
        super(model, brand, type, buyingPrice, sellingPrice, sound );
        this.numberOfDroneReeds = numberOfDroneReeds;
        this.size = size;
    }

    public int getNumberOfDroneReeds() {
        return this.numberOfDroneReeds;
    }

    public String getSize() {
        return this.size;
    }

//    public String play() {
//        return "typical zampogna sound: boo boooo";
//    }
}
