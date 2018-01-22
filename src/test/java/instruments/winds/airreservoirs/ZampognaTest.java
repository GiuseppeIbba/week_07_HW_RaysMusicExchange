package instruments.winds.airreservoirs;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZampognaTest {

    Zampogna zampogna;

    @Before
    public void before() {
        zampogna = new Zampogna ("ZM47P9", "Fornari Zampogne", "Classic", 524.66, 895.78,4, "3/4");
    }

    @Test
    public void zampognaCanHaveModel() {
        assertEquals("ZM47P9", zampogna.getModel());
    }

    @Test
    public void zampognaCanHaveBrand() {
        assertEquals("Fornari Zampogne", zampogna.getBrand());
    }

    @Test
    public void zampognaCanHaveType() {
        assertEquals("Classic", zampogna.getType());
    }

    @Test
    public void zampognaCanHaveNumberOfDroneReeds() {
        assertEquals(4, zampogna.getNumberOfDroneReeds());
    }

    @Test
    public void zampognaCanHaveSize() {
        assertEquals("3/4", zampogna.getSize());
    }

    @Test
    public void zampognaCanHaveBuyingPrice() {
        assertEquals(524.66, zampogna.getBuyingPrice(), 0.001);
    }

    @Test
    public void zampognaCanHaveSellingPrice() {
        assertEquals(895.78, zampogna.getSellingPrice(), 0.001);
    }

    @Test
    public void zampognaCanPlay() {
        assertEquals("typical zampogna sound: boo boooo", zampogna.play());
    }

    @Test
    public void zampognaHaveAMarkup() {
        assertEquals(70.74, zampogna.markup(), 0.01);
    }
}
