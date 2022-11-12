import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {
    @Test
    public void test() {
        CabInVoiceGenerator obj = new CabInVoiceGenerator();
        Assert.assertEquals(120.0,obj.getInvoice(10, 20,"R"), 0);
    }

    @Test
    public void test1() {
        CabInVoiceGenerator obj = new CabInVoiceGenerator();
        Assert.assertEquals(240.0, obj.generateInvoiceAsPerUserID(5),0);
    }
    @Test
    public void test2() {
        CabInVoiceGenerator obj = new CabInVoiceGenerator();
        Assert.assertEquals(220.0,obj.getInvoice(10, 20,"P"), 0);
    }

}
