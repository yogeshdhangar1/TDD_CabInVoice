import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {
    @Test
    public void test() {
        CabInVoiceGenerator obj = new CabInVoiceGenerator();
        Assert.assertEquals(120.0, obj.getInvoice(10, 20), 0);
    }

    @Test
    public void test1() {
        CabInVoiceGenerator obj = new CabInVoiceGenerator();
        Assert.assertEquals(240.0, obj.getInvoice(20, 40), 0);
    }
}
