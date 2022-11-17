package shoppinglist;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test public void shouldReturnNameOfItem() {
        Item item1 = new Item("banana", 0.99);
        assertEquals(item1.name, "banana");
    }
    @Test public void shouldReturnPriceOfItem() {
        Item item1 = new Item("banana", 0.99);
        assertEquals(item1.price, Double.valueOf(0.99));
    }
}
