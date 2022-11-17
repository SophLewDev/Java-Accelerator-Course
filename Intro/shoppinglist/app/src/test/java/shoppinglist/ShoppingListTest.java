package shoppinglist;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShoppingListTest {

    @Test public void initialisedWithEmptyListOfNames() {
        ShoppingList shoppingList = new ShoppingList();
        assertEquals(shoppingList.items.size(), 0);
    }
    @Test public void addItemToShoppingList() {
        Item item1 = new Item("banana", 0.99);
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.addItem(item1);
        assertEquals(shoppingList.items.size(), 1);
    }
    @Test public void getItemsInShoppingList() {
        Item item1 = new Item("banana", 0.99);
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.addItem(item1);
        assertTrue(shoppingList.getItems().contains(item1));
    }
}
