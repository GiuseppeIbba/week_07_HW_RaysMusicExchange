package instruments.strings.boweds;

import instruments.Instrument;
import interfaces.IPlayable;

public class Cello extends Instrument implements IPlayable {
    private int numberOfStrings;
    private String size;

    public Cello(String model, String brand, String type, double buyingPrice, double sellingPrice, int numberOfStrings, String size) {
        super(model, brand, type, buyingPrice, sellingPrice );
        this.numberOfStrings = numberOfStrings;
        this.size = size;

    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }

    public String getSize() {
        return this.size;
    }

    public String play() {
        return "typical cello sound: zan zan";
    }

}
