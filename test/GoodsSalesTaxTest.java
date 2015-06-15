import junit.framework.TestCase;
import junit.framework.TestResult;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoodsSalesTaxTest  {
    @Test
    public void shouldBeExcumpted() throws Exception {
        GoodsSalesTax goodsSalesTax=new GoodsSalesTax();

        double actualTax=goodsSalesTax.SalesTaxForExcumption("book");

        assertEquals(0.0,actualTax,0.0d);


    }
}