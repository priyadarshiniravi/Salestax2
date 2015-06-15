public class App {
    ConsoleInputOutput consoleInputOutput;

    public App(ConsoleInputOutput consoleInputOutput) {
        this.consoleInputOutput = consoleInputOutput;
    }

    public void start()
    {
        String input=consoleInputOutput.getInputAsString();
    }
}
