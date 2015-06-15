
public class Goods {
    public boolean imported;
    public String name;
    private double price;

    Goods(boolean imported, String name, double price) {
        this.imported = imported;
        this.name = name;
        this.price = price;
    }

    public double computeSalesTaxAddedToPrice() {
        GoodsSalesTax salesTax = new GoodsSalesTax();
        return price + price * salesTax.SalesTaxForExcumption(name);

    }

    public double computeImportExportDuty() {
        if (imported) {
            return 0.05 * price;
        }
        return 0.0d * price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Goods goods = (Goods) o;

        if (imported != goods.imported) return false;
        if (Double.compare(goods.price, price) != 0) return false;
        return !(name != null ? !name.equals(goods.name) : goods.name != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (imported ? 1 : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
