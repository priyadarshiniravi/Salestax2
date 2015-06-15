public class Parser {
    private String input;


    public void get(String input)
    {
        this.input = input;
    }

    public Goods parse() {
        String[] tokens = splitInput();
        boolean isImportedGoods = isImported(tokens);
        double price = goodsPrice(tokens);
        String name = goodsName(tokens);
        return new Goods(isImportedGoods,name,price);

    }

    private String goodsName(String[] tokens) {
        String name = "";
        int i = 3;
        if (tokens[2] != "imported")
            name = name + tokens[2];
        while (!tokens[i].equals("at")) {
            name = name + " " + tokens[i];
            i++;
        }
        return name;

    }

    private double goodsPrice(String tokens[]) {
        int i = 0;

        while (!tokens[i].equals("at"))
            i++;
        return Double.parseDouble(tokens[i + 1]);
    }

    private String[] splitInput() {
        return input.split(" ");
    }

    private boolean isImported(String tokens[]) {
        if (tokens[1].equals("imported")) {
            return true;
        }
        return false;
    }

}
