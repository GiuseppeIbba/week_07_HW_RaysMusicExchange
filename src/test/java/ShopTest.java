import accessories.percussions.DrumStick;
import accessories.strings.Pickup;
import instruments.Instrument;
import instruments.strings.pluckeds.Guitar;
import instruments.winds.airreservoirs.Bagpipe;
import instruments.winds.brasses.Trumpet;
import interfaces.ISellable;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ISellable item;


    @Before
    public void before() {
       shop = new Shop("Ray's Music Exchange");
    }

    @Test
    public void shopCanHaveAName() {
        assertEquals("Ray's Music Exchange", shop.getName());
    }
    @Test
    public void canStartEmpty() {
        assertEquals(0, shop.itemCount());
    }

    @Test
    public void canSellAnItem() {
        item = new Guitar("TSF48C", "Takamine", "Classic", 1300.00, 1899.00, "twang", 6);
        shop.putToSell(item);
        assertEquals(1, shop.itemCount());
    }

    @Test
    public void canAddInstrumentsAndAccessories() {
        item = new Guitar("TSF48C", "Takamine", "Classic", 1300.00, 1899.00, "twang", 6);
        shop.putToSell(item);
        item = new Trumpet("Yamaha YTR-4435 II", "Yamaha", "Herald trumpet", 766.98, 849.28, "asd", 3);
        shop.putToSell(item);
        item = new Bagpipe("DM1", "Rooseback's Bagpipes", "Great Highland Bagpipe", 105.86, 188.90, "boo boooo", 3,"3/4");
        shop.putToSell(item);
        item = new Pickup("Belcat BH-3", "EMG", "Guitar", "Humbucker Pickup", 6.00, 9.99);
        shop.putToSell(item);
        item = new DrumStick("Classic 5A", "Vic Firth American", "Drum", "Hickory Drumstick", 3.84, 8.79, "Wood");
        shop.putToSell(item);
        assertEquals(5, shop.itemCount());
    }


 }
