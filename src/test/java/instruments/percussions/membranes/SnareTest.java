package instruments.percussions.membranes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SnareTest {

    Snare snare;

    @Before
    public void before() {
        snare = new Snare("Performance Snare", "Drum Workshop", "Marching Snare", 324.45, 389.00, "tum tum", "Remo USA", "14 X 5.5");
    }

    @Test
    public void snareCanHaveModel() {
        assertEquals("Performance Snare", snare.getModel());
    }

    @Test
    public void snareCanHaveBrand() {
        assertEquals("Drum Workshop", snare.getBrand());
    }

    @Test
    public void snareCanHaveType() {
        assertEquals("Marching Snare", snare.getType());
    }

    @Test
    public void snareCanHaveBuyingPrice() {
        assertEquals(324.45, snare.getBuyingPrice(), 0.001);
    }

    @Test
    public void snareCanHaveSellingPrice() {
        assertEquals(389.00, snare.getSellingPrice(), 0.001);
    }

    @Test
    public void snareCanHaveHead() {
        assertEquals("Remo USA", snare.getHead());
    }

    @Test
    public void snareCanHaveDiameter() {
        assertEquals("14 X 5.5", snare.getDiameter());
    }

    @Test
    public void snareCanPlay() {
        assertEquals("tum tum", snare.play());
    }

    @Test
    public void snareHaveAMarkup() {
        assertEquals(19.9, snare.markup(), 0.01);
    }

}
