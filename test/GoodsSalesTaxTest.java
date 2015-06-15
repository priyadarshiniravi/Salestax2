import junit.framework.TestCase;
import junit.framework.TestResult;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoodsSalesTaxTest  {
    @Test
    public void shouldBeExcumpted() throws Exception {
        GoodsSalesTax goodsSalesTax=new GoodsSalesTax();

        double actualTax=goodsSalesTax.SalesTaxForExcumption("book");

        assertEquals(0.0,actualTax,0.0d);


    }

    @Test
    public void ShouldComputeSalesTaxForChocolate() {
        Goods chocolate = new Goods(false, "Chocolate Bar", 26);

        double actualSalesTax = chocolate.computeSalesTaxAddedToPrice();

        Assert.assertEquals(26.0d, actualSalesTax, 0.0d);

    }

    @Test
    public void ShouldComputeSalesTaxForOthers() {
        Goods perfume = new Goods(false, "Perfume", 10);

        double actualSalesTax = perfume.computeSalesTaxAddedToPrice();

        Assert.assertEquals(11.0d, actualSalesTax, 0.0d);

    }

    @Test
    public void ShouldComputeImportExportDutyForNotImported() {
        Goods perfume = new Goods(false, "Perfume", 10);

        double actualComputeImportExportDuty = perfume.computeImportExportDuty();

        Assert.assertEquals(0.0d, actualComputeImportExportDuty, 0.0d);

    }

    @Test
    public void ShouldComputeImportExportDutyForImported() {
        Goods perfume = new Goods(true, "Perfume", 20);

        double actualComputeImportExportDuty = perfume.computeImportExportDuty();

        Assert.assertEquals(1.0d, actualComputeImportExportDuty, 0.0d);

    }
}