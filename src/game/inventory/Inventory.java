package game.inventory;

/**
 * Manages a collection of Items in the game shop.
 *
 * Name:        Ferzan
 * Student ID:  240444049
 * Date:        28.10.2026
 */
public class Inventory {

    private Item[] items;
    private int count;

    public Inventory() {
        items = new Item[10];
        count = 0;
    }

    /** Adds an item to the inventory. */
    public void addItem(Item item) {
        if (count < items.length) {
            items[count] = item;
            count++;
        }
    }

    /** Displays name, genre, and stock count for every item. */
    public void displayAll() {
        System.out.println("--- Inventory Listing ---");
        for (int i = 0; i < count; i++) {
            System.out.printf("%-15s | %-8s | Stock: %d%n",
                    items[i].getName(),
                    items[i].getGenre(),
                    items[i].getStockCount());
        }
    }

    /**
     * Prints each item's name and serial code.
     * This is allowed because Inventory is in the SAME package as Item,
     * so it can access Item's package-private getSerialCode() method.
     */
    public void auditSerialCodes() {
        System.out.println("--- Serial Code Audit ---");
        for (int i = 0; i < count; i++) {
            System.out.printf("%-15s -> %s%n",
                    items[i].getName(),
                    items[i].getSerialCode());
        }
    }
}