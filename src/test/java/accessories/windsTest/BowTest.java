package accessories.windsTest;

import accessories.winds.Bow;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowTest {

    Bow bow;

    @Before
    public void before() {
        bow = new Bow("Stentor:1261", "Musicroom", "Violin", "Bow", 17.56, 23.99, "Ebon");
    }

    @Test
    public void bowCanHavePartlName() {
        assertEquals("Stentor:1261", bow.getPartName());
    }

    @Test
    public void bowCanHaveBrandName() {
        assertEquals("Musicroom", bow.getBrand());
    }

    @Test
    public void bowCanHavePartFor() {
        assertEquals("Violin", bow.getPartFor());
    }

    @Test
    public void bowCanHaveType() {
        assertEquals("Bow", bow.getType());
    }

    @Test
    public void bowCanHaveBuyingPrice() {
        assertEquals(17.56, bow.getBuyingPrice(), 0.001);
    }

    @Test
    public void bowCanHaveSellingPrice() {
        assertEquals(23.99, bow.getSellingPrice(), 0.001);
    }

    @Test
    public void bowCanHaveMaterial() {
        assertEquals("Ebon", bow.getMaterial());
    }
    @Test
    public void bowHaveAMarkup () {
        assertEquals(36.62, bow.markup(), 0.01);
    }

}
