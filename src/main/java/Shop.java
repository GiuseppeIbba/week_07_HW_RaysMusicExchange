import instruments.Instrument;
import instruments.strings.pluckeds.Guitar;
import instruments.winds.airreservoirs.Bagpipe;
import interfaces.ISellable;

import java.util.ArrayList;

public class Shop  {

    private String name;
    private ArrayList<ISellable> stock;

    public Shop(String name) {
        this.stock = new ArrayList<ISellable>();
        this.name = name;
    }


    public String getName() {
        return this.name;
    }



    public void putToSell(ISellable item) {
        this.stock.add(item);
    }

    public void sellAnItem(ISellable item) {
        this.stock.remove(item);
    }

    public int itemCount() {
        return this.stock.size();
    }

}
