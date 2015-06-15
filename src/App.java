import java.util.ArrayList;

public class App {
    ConsoleInputOutput consoleInputOutput;
    private ArrayList<Goods> goodsArrayList;
    private Parser parser;


    public App(ConsoleInputOutput consoleInputOutput, ArrayList<Goods> goodsArrayList,Parser parser) {
        this.consoleInputOutput = consoleInputOutput;
        this.goodsArrayList = goodsArrayList;
        this.parser =parser ;
    }

    public void start() {
        String input;
        int option = 1;
        consoleInputOutput.print("enter one input press 1 to continue then next");
        while (option == 1) {
            input = consoleInputOutput.getInputAsString();
            parser.get(input);
            Goods goods = parser.parse();
            goodsArrayList.add(goods);
            consoleInputOutput.print("Press 1 to Continue");
            option = Integer.parseInt(consoleInputOutput.getInputAsString());

        }
        GoodsList goodsList=new GoodsList(goodsArrayList,consoleInputOutput);
        goodsList.ComputeTotalPrice();

    }
}
