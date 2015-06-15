import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

public class AppTest {
    @Test
    public void ShouldGetInputFromTheUser() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        when(consoleInputOutput.getInputAsString())
                .thenReturn("1 imported bottle of perfume at 27.99", "0");
        ArrayList<Goods> goodsArrayList = new ArrayList<>();
        Parser parser=mock(Parser.class);
        App app = new App(consoleInputOutput, goodsArrayList,parser);

        app.start();

        verify(consoleInputOutput, times(2)).getInputAsString();


    }

    public void ParserIsCalled() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        when(consoleInputOutput.getInputAsString())
                .thenReturn("1 imported bottle of perfume at 27.99", "0");
        ArrayList<Goods> goodsArrayList = new ArrayList<>();
        Parser parser=mock(Parser.class);
        App app = new App(consoleInputOutput, goodsArrayList,parser);

        app.start();

        verify(parser, times(2)).parse();

    }

}