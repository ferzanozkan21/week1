package game.inventory;

import game.inventory.Item;
import game.inventory.Inventory;

/**
 * game_shop.java
 * Driver class for testing Inventory and Item.
 *
 * Name:        Ferzan
 * Student ID:  240444049
 * Date:        28.10.2026
 */
public class game_shop {
    public static void main(String[] args) {

        Inventory shop = new Inventory();

        // Create 3 Item objects and add them to the inventory
        Item item1 = new Item("Galaxy Racer", "Racing", 12, "GR-4421");
        Item item2 = new Item("Shadow Realm", "RPG", 5, "SR-8873");
        Item item3 = new Item("Pixel Legends", "Strategy", 3, "PL-0091");

        shop.addItem(item1);
        shop.addItem(item2);
        shop.addItem(item3);

        // Initial inventory list
        shop.displayAll();

        System.out.println();

        // Sell some copies
        item1.sell(4);
        item2.sell(6); // Yetersiz stok uyarısı vermeli (sadece 5 stok var)

        System.out.println();

        // Display updated inventory
        shop.displayAll();

        System.out.println();

        // Audit serial codes
        shop.auditSerialCodes();

        // System.out.println(item1.getSerialCode());
        /*
         * WHY THIS FAILS TO COMPILE:
         * The method 'getSerialCode()' has package-private access (no access modifier).
         * It can only be directly called by classes inside the 'game.inventory' package.
         * Since 'game_shop' lives in the root directory (default package), it cannot access
         * package-private methods of a class in 'game.inventory'.
         */
    }
}