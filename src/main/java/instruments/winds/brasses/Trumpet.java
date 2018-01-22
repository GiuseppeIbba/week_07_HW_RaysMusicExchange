package instruments.winds.brasses;

import instruments.Instrument;

public class Trumpet extends Instrument {

    private int numberOfValves;

    public Trumpet(String model, String brand, String type, double buyingPrice, double sellingPrice, int numberOfValves) {
        super(model, brand, type, buyingPrice, sellingPrice );
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return this.numberOfValves;
    }

    public String play() {
        return "typical trumpet sound: prrr prrrr";
    }

}

