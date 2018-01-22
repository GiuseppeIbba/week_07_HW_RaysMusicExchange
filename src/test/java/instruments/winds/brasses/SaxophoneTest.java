package instruments.winds.brasses;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before() {
        saxophone = new Saxophone("SAS701", "Sonata", "Herald saxophone", 766.98, 849.28, 3);
    }

    @Test
    public void saxophoneCanHaveModel() {
        assertEquals("SAS701", saxophone.getModel());
    }

    @Test
    public void saxophoneCanHaveBrand() {
        assertEquals("Sonata", saxophone.getBrand());
    }

    @Test
    public void saxophoneCanHaveType() {
        assertEquals("Herald saxophone", saxophone.getType());
    }

    @Test
    public void saxophoneCanHaveNumberOfValves() {
        assertEquals(3, saxophone.getNumberOfValves());
    }

    @Test
    public void saxophoneCanHaveBuyingPrice() {
        assertEquals(766.98, saxophone.getBuyingPrice(), 0.001);
    }

    @Test
    public void saxophoneCanHaveSellingPrice() {
        assertEquals(849.28, saxophone.getSellingPrice(), 0.001);
    }

    @Test
    public void saxophoneCanPlay() {
        assertEquals("typical saxophone sound: pffff pffff", saxophone.play());
    }

    @Test
    public void saxophoneHaveAMarkup() {
        assertEquals(10.73, saxophone.markup(), 0.01);
    }
}
