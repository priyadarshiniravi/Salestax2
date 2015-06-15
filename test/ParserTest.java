import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParserTest {
    @Test
    public void shouldParseInputAndReturnGoods() {
        Parser parser = new Parser();
        parser.get("1 imported bottle of perfume at 27.99");

        Goods expectedGoods = new Goods(true, "bottle of perfume", 27.99);
        Goods actualGoods = parser.parse();

        assertEquals(expectedGoods, actualGoods);


    }

}