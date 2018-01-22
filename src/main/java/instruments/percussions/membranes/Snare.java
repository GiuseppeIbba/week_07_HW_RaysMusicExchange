package instruments.percussions.membranes;

import instruments.Instrument;
import interfaces.IPlayable;

public class Snare extends Instrument implements IPlayable {

    private String head;
    private String diameter;

    public Snare(String model, String brand, String type, double buyingPrice, double sellingPrice, String head, String diameter) {
        super(model, brand, type, buyingPrice, sellingPrice);
        this.head = head;
        this.diameter = diameter;
    }

    public String getHead() {
        return this.head;
    }

    public String getDiameter() {
        return this.diameter;
    }

    public String play() {
        return "typical snare sound: tum tum";
    }
}
