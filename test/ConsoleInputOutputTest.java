

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static junit.framework.TestCase.assertEquals;

public class ConsoleInputOutputTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();


    @Before
    public void setUpStreams() {

        System.setOut(new PrintStream(outContent));
    }


    @Test
    public void ShouldGetUserInputString() {
        ByteArrayInputStream in = new ByteArrayInputStream("String".getBytes());
        System.setIn(in);
        ConsoleInputOutput consoleInputOutput = new ConsoleInputOutput(new Scanner(System.in));

        String actualInput = consoleInputOutput.getInputAsString();

        assertEquals("String", actualInput);


    }

//    @Test
//    public void ShouldDisplayOutputToUser() {
//        ConsoleInputOutput consoleInputOutput = new ConsoleInputOutput(new Scanner(System.in));
//
//        consoleInputOutput.print("Hai!");
//
//        assertEquals("Hai!"+ "\n", outContent.toString());
//
//
//    }
}
