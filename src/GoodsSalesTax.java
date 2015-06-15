

import java.util.ArrayList;

public class GoodsSalesTax {

    ArrayList<String> ExcumptedGoods = new ArrayList<>();

    public GoodsSalesTax() {
        ExcumptedGoods.add("Chocolate Bar");
        ExcumptedGoods.add("book");
        ExcumptedGoods.add("Box of Chocolate");
        ExcumptedGoods.add("headache pills");
        ExcumptedGoods.add("chocolates");

    }


    public double SalesTaxForExcumption(String goodsName) {
        if (ExcumptedGoods.contains(goodsName))
            return 0;
        else
            return 0.1;
    }
}