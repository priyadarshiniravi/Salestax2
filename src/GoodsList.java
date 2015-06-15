

import java.util.ArrayList;

public class GoodsList {
    private ArrayList<Goods> goodsArrayList = new ArrayList<>();
    private ConsoleInputOutput consoleInputOutput;

    public GoodsList(ArrayList<Goods> goodsArrayList, ConsoleInputOutput consoleInputOutput) {
        this.goodsArrayList = goodsArrayList;
        this.consoleInputOutput = consoleInputOutput;
    }

    void ComputeTotalPrice() {
        double total = 0.0d;
        System.out.println();
        for (Goods goods : goodsArrayList) {
            total = total + goods.computeSalesTaxAddedToPrice() + goods.computeImportExportDuty();
            consoleInputOutput.print(goods.toString() + (goods.computeSalesTaxAddedToPrice() + goods.computeImportExportDuty()));

        }
        consoleInputOutput.print(total+"");

    }


}