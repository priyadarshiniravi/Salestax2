import junit.framework.TestCase;
import org.junit.Test;
import org.omg.CORBA.CODESET_INCOMPATIBLE;

import java.util.Scanner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AppTest {
    @Test
    public void ShouldGetInputFromTheUser() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        App app = new App(consoleInputOutput);

        app.start();

        verify(consoleInputOutput).getInputAsString();


    }

}