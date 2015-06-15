import java.util.Scanner;

public class ConsoleInputOutput {
    private Scanner consoleInput;

    public ConsoleInputOutput(Scanner consoleInput) {
        this.consoleInput = consoleInput;
    }



    public String getInputAsString() {
        String input=consoleInput.nextLine();
        return input;
    }

    public void print(String output) {
        System.out.println(output);

    }
}
