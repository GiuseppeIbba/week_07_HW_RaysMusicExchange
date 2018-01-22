package instruments.strings.pluckeds;

import instruments.Instrument;
import interfaces.IPlayable;
import interfaces.ISellable;

public class Guitar extends Instrument implements IPlayable {

    private int numberOfStrings;

    public Guitar(String model, String brand, String type, double buyingPrice, double sellingPrice, String sound, int numberOfStrings) {
        super(model, brand, type, buyingPrice, sellingPrice, sound );
        this.numberOfStrings = numberOfStrings;
    }


    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }

//    public String play() {
//        return "typical guitar sound: twang";
//    }

}
