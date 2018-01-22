package accessories.percussionsTest;

import accessories.percussions.DrumStick;
import accessories.winds.Bow;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumStick drumStick;

    @Before
    public void before() {
        drumStick = new DrumStick("Classic 5A", "Vic Firth American", "Drum", "Hickory Drumstick", 3.84, 8.79, "Wood");
    }

    @Test
    public void drumStickCanHavePartlName() {
        assertEquals("Classic 5A", drumStick.getPartName());
    }

    @Test
    public void drumStickCanHaveBrandName() {
        assertEquals("Vic Firth American", drumStick.getBrand());
    }

    @Test
    public void drumStickCanHavePartFor() {
        assertEquals("Drum", drumStick.getPartFor());
    }

    @Test
    public void drumStickCanHaveType() {
        assertEquals("Hickory Drumstick", drumStick.getType());
    }

    @Test
    public void drumStickCanHaveBuyingPrice() {
        assertEquals(3.84, drumStick.getBuyingPrice(), 0.001);
    }

    @Test
    public void drumStickCanHaveSellingPrice() {
        assertEquals(8.79, drumStick.getSellingPrice(), 0.001);
    }

    @Test
    public void drumStickCanHaveMaterial() {
        assertEquals("Wood", drumStick.getMaterial());
    }
    @Test
    public void drumStickHaveAMarkup () {
        assertEquals(128.91, drumStick.markup(), 0.01);
    }

}
