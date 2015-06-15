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
        String input = consoleInputOutput.getInputAsString();
        int option = 1;
        while (option == 1) {
            parser.get("1 imported bottle of perfume at 27.99");
            Goods goods = parser.parse();
            goodsArrayList.add(goods);
            consoleInputOutput.print("Do you want to Continue");
            option = Integer.parseInt(consoleInputOutput.getInputAsString());
        }

    }
}
