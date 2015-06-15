import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class EntryPoint {
    public static void main(String args[])
    {   ConsoleInputOutput consoleInputOutput=new ConsoleInputOutput(new Scanner(System.in));
        ArrayList<Goods> goods=new ArrayList<>();
        Parser parser=new Parser();
        App app=new App(consoleInputOutput,goods,parser);
        app.start();
    }
}
