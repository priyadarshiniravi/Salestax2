import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GoodsTest  {
@Test
public void equalityShouldSatisfyReflexivity() {
    Goods goods  = new Goods(true,"Goods",3.0);

    Assert.assertThat(goods, is(equalTo(goods)));
}

@Test
public void equalityShouldSatisfySymmetricity() {
    Goods goods  = new Goods(true,"Goods",3.0);
    Goods goodsTwo  = new Goods(true,"Goods",3.0);

    Assert.assertThat(goods, is(equalTo(goodsTwo)));
    Assert.assertThat(goodsTwo, is(equalTo(goods)));
}

@Test
public void equalityShouldSatisfyTransitivity() {
    Goods goods  = new Goods(true,"Goods",3.0);
    Goods goodsTwo  = new Goods(true,"Goods",3.0);
    Goods goodsThree  = new Goods(true,"Goods",3.0);

    Assert.assertThat(goods, is(equalTo(goodsTwo)));
    Assert.assertThat(goodsTwo, is(equalTo(goodsThree)));
    Assert.assertThat(goods, is(equalTo(goodsThree)));
}

@Test
public void equalityShouldReturnFalseOnPassingNull() {
    Goods goods  = new Goods(true,"Goods",3.0);

    assertFalse(goods.equals(null));
}

@Test
public void equalityShouldReturnFalseOnPassingOtherObject() {
    Goods goods  = new Goods(true,"Goods",3.0);

    assertFalse(goods.equals(new String("Hello, World")));
}

@Test
public void whenTwoObjectsAreEqualThenTheirHashCodeMustBeEqual() {
    Goods goods  = new Goods(true,"Goods",3.0);
    Goods goodsOne  = new Goods(true,"Goods",3.0);

    assertThat(goods.hashCode(), is(equalTo(goodsOne.hashCode())));
}
}