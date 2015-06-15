import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GoodsListTest {

    @Test
    public void ShouldCalculateSalesTaxAndPrint() {
        Goods chocolate = new Goods(false, "Chocolate Bar", 0.85);
        Goods musicCd = new Goods(false, "music CD", 14.99);
        Goods book = new Goods(false, "book", 12.49);
        ArrayList<Goods> goodsList = new ArrayList<>();
        goodsList.add(chocolate);
        goodsList.add(musicCd);
        goodsList.add(book);
        ConsoleInputOutput consoleInputOutput=mock(ConsoleInputOutput.class);
        GoodsList goodsListObject = new GoodsList(goodsList, consoleInputOutput);

        goodsListObject.ComputeTotalPrice();

        verify(consoleInputOutput,times(4)).print(anyString());

    }


}
