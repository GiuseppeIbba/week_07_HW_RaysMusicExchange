package instruments.strings.pluckeds;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BanjoTest {

    Banjo banjo;

    @Before
    public void before() {
        banjo = new Banjo("Luna Celtic Banjo", "Luna Guitars", "Classic", 275.00, 319.00, 5);
    }

    @Test
    public void banjoCanHaveModel() {
        assertEquals("Luna Celtic Banjo", banjo.getModel());
    }

    @Test
    public void banjoCanHaveBrand() {
        assertEquals("Luna Guitars", banjo.getBrand());
    }

    @Test
    public void banjoCanHaveType() {
        assertEquals("Classic", banjo.getType());
    }

    @Test
    public void banjoCanHaveNumberOfStrings() {
        assertEquals(5, banjo.getNumberOfStrings());
    }

    @Test
    public void banjoCanHaveBuyingPrice() {
        assertEquals(275.00, banjo.getBuyingPrice(), 0.01);
    }

    @Test
    public void banjoCanHaveSellingPrice() {
        assertEquals(319.00, banjo.getSellingPrice(), 0.001);
    }

    @Test
    public void banjoCanPlay() {
        assertEquals("typical banjo sound: twing", banjo.play());
    }

    @Test
    public void banjoHaveAMarkup() {
        assertEquals(16.0, banjo.markup(), 0.01);
    }
}
