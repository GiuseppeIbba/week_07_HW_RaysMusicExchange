package instruments.winds.brasses;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet("Yamaha YTR-4435 II", "Yamaha", "Herald trumpet", 766.98, 849.28, "prrr prrrr", 3);
    }

    @Test
    public void trumpetCanHaveModel() {
        assertEquals("Yamaha YTR-4435 II", trumpet.getModel());
    }

    @Test
    public void trumpetCanHaveBrand() {
        assertEquals("Yamaha", trumpet.getBrand());
    }

    @Test
    public void trumpetCanHaveType() {
        assertEquals("Herald trumpet", trumpet.getType());
    }

    @Test
    public void trumpetCanHaveNumberOfValves() {
        assertEquals(3, trumpet.getNumberOfValves());
    }

    @Test
    public void trumpetCanHaveBuyingPrice() {
        assertEquals(766.98, trumpet.getBuyingPrice(), 0.001);
    }

    @Test
    public void trumpetCanHaveSellingPrice() {
        assertEquals(849.28, trumpet.getSellingPrice(), 0.001);
    }

    @Test
    public void trumpetCanPlay() {
        assertEquals("prrr prrrr", trumpet.play());
    }

    @Test
    public void trumpetHaveAMarkup() {
        assertEquals(10.73, trumpet.markup(), 0.01);
    }
}
