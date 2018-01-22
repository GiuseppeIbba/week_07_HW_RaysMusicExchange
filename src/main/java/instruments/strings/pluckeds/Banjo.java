package instruments.strings.pluckeds;

import com.sun.istack.internal.Pool;
import instruments.Instrument;
import interfaces.IPlayable;
import interfaces.ISellable;

import java.awt.image.ImagingOpException;

public class Banjo extends Instrument implements IPlayable{

    private int numberOfStrings;

    public Banjo(String model, String brand, String type, double buyingPrice, double sellingPrice, String sound, int numberOfStrings) {
        super(model, brand, type, buyingPrice, sellingPrice, sound );
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }

//    public String play() {
//        return "typical banjo sound: twing";
//    }

}
