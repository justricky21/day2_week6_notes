import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    Card sevenOfHearts;
    @Before
    public void before(){
        sevenOfHearts = new Card(SuiteType.HEART, NumberType.SEVEN);
    }

    @Test
    public void hasSuite(){
        assertEquals(SuiteType.HEART, sevenOfHearts.getSuite());
    }

    @Test
    public void hasNumber(){
        assertEquals(NumberType.SEVEN, sevenOfHearts.getNumber());
    }

    @Test
    public void getSuiteValue(){
        assertEquals(2, sevenOfHearts.getSuite().getValue());
    }

    @Test
    public void getDeck(){
        assertEquals(52, Card.getDeck().size());
    }
}
