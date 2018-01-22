import instruments.Instrument;
import instruments.strings.pluckeds.Guitar;
import interfaces.ISell;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ArrayList<ISell> stock;
    Guitar guitar;


    @Before
    public void before() {
        stock = new ArrayList<>();
    }

    @Test
    public void canSellAnItem() {
        guitar = new Guitar("TSF48C", "Takamine", "Classic", 1300.00, 1899.00, 6);
        shop.putToSell();
        assertEquals(1, shop.itemCount());
    }
}
//    public void sellAnItem(String item) {
//        stock.add(item);
//    }








//    public void putToSell(String item) {
//        stock.remove(item);
//    }



    //    public double calcuateMarkup() {
//        return Instrument.markup();
//    }
