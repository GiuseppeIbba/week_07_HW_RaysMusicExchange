package instruments.strings.boweds;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void before() {
        violin = new Violin("Wessex XV Series", "The Wessex Violin Co.", "Pre-Baroque", 1854.48, 2375.00, "zan zan", 4, "4/4");
    }
    @Test
    public void violinCanHaveModel() {
        assertEquals("Wessex XV Series", violin.getModel());
    }

    @Test
    public void violinCanHaveBrand() {
        assertEquals("The Wessex Violin Co.", violin.getBrand());
    }

    @Test
    public void violinCanHaveType() {
        assertEquals("Pre-Baroque", violin.getType());
    }

    @Test
    public void violinCanHaveNumberOfStrings() {
        assertEquals(4, violin.getNumberOfStrings());
    }

    @Test
    public void violinCanHaveSize() {
        assertEquals("4/4", violin.getSize());
    }

    @Test
    public void violinCanHaveBuyingPrice() {
        assertEquals(1854.48, violin.getBuyingPrice(), 0.001);
    }

    @Test
    public void violinCanHaveSellingPrice() {
        assertEquals(2375.00, violin.getSellingPrice(), 0.001);
    }

    @Test
    public void violinCanPlay() {
        assertEquals("zan zan", violin.play());
    }

    @Test
    public void violinHaveAMarkup() {
        assertEquals(28.07, violin.markup(), 0.01);
    }
}