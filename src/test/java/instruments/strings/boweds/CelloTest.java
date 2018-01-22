package instruments.strings.boweds;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CelloTest {

    Cello cello;

    @Before
    public void before() {
        cello = new Cello("Rialto VC 730", "Stenton", "Laminated", 282.78, 434.00, 4, "1/4");
    }
    @Test
    public void celloCanHaveModel() {
        assertEquals("Rialto VC 730", cello.getModel());
    }

    @Test
    public void cellonCanHaveBrand() {
        assertEquals("Stenton", cello.getBrand());
    }

    @Test
    public void celloCanHaveType() {
        assertEquals("Laminated", cello.getType());
    }

    @Test
    public void celloCanHaveNumberOfStrings() {
        assertEquals(4, cello.getNumberOfStrings());
    }

    @Test
    public void celloCanHaveSize() {
        assertEquals("1/4", cello.getSize());
    }

    @Test
    public void celloCanHaveBuyingPrice() {
        assertEquals(282.78, cello.getBuyingPrice(), 0.001);
    }

    @Test
    public void celloCanHaveSellingPrice() {
        assertEquals(434.00, cello.getSellingPrice(), 0.001);
    }

    @Test
    public void celloCanPlay() {
        assertEquals("typical cello sound: zan zan", cello.play());
    }

    @Test
    public void celloHaveAMarkup() {
        assertEquals(53.48, cello.markup(), 0.01);
    }
}