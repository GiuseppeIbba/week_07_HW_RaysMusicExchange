package instruments.winds.airreservoirs;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BagpipeTest{

    Bagpipe bagpipe;

    @Before
    public void before() {
        bagpipe = new Bagpipe("DM1", "Rooseback's Bagpipes", "Great Highland Bagpipe", 105.86, 188.90, 3,"3/4");
    }

    @Test
    public void bagpipeCanHaveModel() {
        assertEquals("DM1", bagpipe.getModel());
    }

    @Test
    public void bagpipeCanHaveBrand() {
        assertEquals("Rooseback's Bagpipes", bagpipe.getBrand());
    }

    @Test
    public void bagpipeCanHaveType() {
        assertEquals("Great Highland Bagpipe", bagpipe.getType());
    }

    @Test
    public void bagpipeCanHaveNumberOfDroneReeds() {
        assertEquals(3, bagpipe.getNumberOfDroneReeds());
    }

    @Test
    public void bagpipeCanHaveSize() {
        assertEquals("3/4", bagpipe.getSize());
    }

    @Test
    public void bagpipeCanHaveBuyingPrice() {
        assertEquals(105.86, bagpipe.getBuyingPrice(), 0.001);
    }

    @Test
    public void bagpipeCanHaveSellingPrice() {
        assertEquals(188.90, bagpipe.getSellingPrice(), 0.001);
    }

    @Test
    public void bagpipeCanPlay() {
        assertEquals("typical bagpipe sound: boo boooo", bagpipe.play());
    }

    @Test
    public void bagpipeHaveAMarkup() {
        assertEquals(78.44, bagpipe.markup(), 0.01);
    }
}
