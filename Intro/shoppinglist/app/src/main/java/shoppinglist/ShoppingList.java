package shoppinglist;

import java.util.ArrayList;

public class ShoppingList {
    ArrayList<Item> items;

    public ShoppingList() {
        items = new ArrayList<Item>();
    }

    public static void main(String[] args) {

    }

    public void addItem(Item item) {
        items.add(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

}
