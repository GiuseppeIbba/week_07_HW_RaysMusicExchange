import instruments.Instrument;
import instruments.strings.pluckeds.Guitar;
import instruments.winds.airreservoirs.Bagpipe;
import interfaces.ISell;

import java.util.ArrayList;

public class Shop implements ISell {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.stock = new ArrayList<ISell>();
        this.name = name;
    }

    public double calcuateMarkup() {
        return Instrument.markup();
    }

    public void putToSell(ISell item) {
        stock.add(item);
    }

    public void sellAnItem(ISell item) {
        stock.remove(item);
    }

    public int itemCount() {
        return stock.size();
    }

}
