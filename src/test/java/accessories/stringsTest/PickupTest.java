package accessories.stringsTest;

import accessories.strings.Pickup;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PickupTest {

    Pickup pickup;

    @Before
    public void before() {
        pickup = new Pickup("Belcat BH-3", "EMG", "Guitar", "Humbucker Pickup", 6.00, 9.99);
    }

    @Test
    public void pickupCanHavePartlName() {
    assertEquals("Belcat BH-3", pickup.getPartName());
    }

    @Test
    public void pickupCanHaveBrandName() {
    assertEquals("EMG", pickup.getBrand());
    }

    @Test
    public void pickupCanHavePartFor() {
        assertEquals("Guitar", pickup.getPartFor());
    }

    @Test
    public void pickupCanHaveType() {
        assertEquals("Humbucker Pickup", pickup.getType());
    }

    @Test
    public void pickupCanHaveBuyingPrice() {
        assertEquals(6.00, pickup.getBuyingPrice(), 0.001);
    }

    @Test
    public void pickupCanHaveSellingPrice() {
        assertEquals(9.99, pickup.getSellingPrice(), 0.001);
    }

}
