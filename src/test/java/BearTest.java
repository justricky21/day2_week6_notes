import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {
    Bear bear;
    Salmon salmon;
    River river;

    @Before
    public void Before() {
        bear = new Bear("Pooh");
        salmon = new Salmon();
        river = new River();
    }

    @Test
    public void bellyStartsEmpty(){
        assertEquals(0, bear.foodCount());
    }

    @Test
    public void canEatSalmon(){
        bear.eat(salmon);
        assertEquals(1, bear.foodCount());
    }

    @Test
    public void canEatSalmonFromRiver(){
        river.addFish(salmon);
        assertEquals(1, river.salmonCount());
        bear.eatFishFromRiver(river);
        assertEquals(1, bear.foodCount());
        assertEquals(0, river.salmonCount());
    }

    @Test
    public void shouldEmptyBellyAfterSleeping(){
        bear.eat(salmon);
        assertEquals(1, bear.foodCount());
        bear.sleep();
        assertEquals(0, bear.foodCount());
    }



}
