package instruments.strings.pluckeds;

import com.sun.istack.internal.Pool;
import instruments.Instrument;
import interfaces.IPlayable;
import interfaces.ISell;

import java.awt.image.ImagingOpException;

public class Banjo extends Instrument implements IPlayable{

    private int numberOfStrings;

    public Banjo(String model, String brand, String type, double buyingPrice, double sellingPrice, int numberOfStrings) {
        super(model, brand, type, buyingPrice, sellingPrice );
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }

    public String play() {
        return "typical banjo sound: twing";
    }

}
