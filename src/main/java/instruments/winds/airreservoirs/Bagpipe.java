package instruments.winds.airreservoirs;

import instruments.Instrument;

public class Bagpipe extends Instrument {

    private int numberOfDroneReeds;
    private String size;

    public Bagpipe(String model, String brand, String type, double buyingPrice, double sellingPrice, int numberOfDroneReeds, String size) {
        super(model, brand, type, buyingPrice, sellingPrice );
        this.numberOfDroneReeds = numberOfDroneReeds;
        this.size = size;

    }

    public int getNumberOfDroneReeds() {
        return this.numberOfDroneReeds;
    }

    public String getSize() {
        return this.size;
    }

    public String play() {
        return "typical bagpipe sound: boo boooo";
    }
}
