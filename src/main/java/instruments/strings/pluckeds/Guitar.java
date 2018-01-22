package instruments.strings.pluckeds;

import instruments.Instrument;
import interfaces.IPlayable;
import interfaces.ISell;

public class Guitar extends Instrument implements IPlayable {

    private int numberOfStrings;

    public Guitar(String model, String brand, String type, double buyingPrice, double sellingPrice,  int numberOfStrings) {
        super(model, brand, type, buyingPrice, sellingPrice );
        this.numberOfStrings = numberOfStrings;
    }


    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }

    public String play() {
        return "typical guitar sound: twang";
    }

}
