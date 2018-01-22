package instruments.strings.pluckeds;

import instruments.Instrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("TSF48C", "Takamine", "Classic", 1300.00,  1899.00, 6);
    }

    @Test
    public void guitarCanHaveModel() {
        assertEquals("TSF48C", guitar.getModel());
    }

    @Test
    public void guitarCanHaveBrand() {
        assertEquals("Takamine", guitar.getBrand());
    }

    @Test
    public void guitarCanHaveType() {
        assertEquals("Classic", guitar.getType());
    }

    @Test
    public void guitarCanHaveNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void guitarCanHaveBuyingPrice() {
        assertEquals(1300.00, guitar.getBuyingPrice(), 0.001);
    }

    @Test
    public void guitarCanHaveSellingPrice() {
        assertEquals(1899.00, guitar.getSellingPrice(), 0.001);
    }

    @Test
    public void guitarCanPlay() {
        assertEquals("typical guitar sound: twang", guitar.play());
    }

    @Test
    public void guitarHaveAMarkup() {
        assertEquals(46.07, guitar.markup(), 0.01);
    }

}

