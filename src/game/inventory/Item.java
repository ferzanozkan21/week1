package game.inventory;


/**
 * Represents a single game title available in the shop.
 * Access modifiers are chosen to enforce least privilege.
 *
 * Name:        Ferzan
 * Student ID:  240444049
 * Date:        28.10.2026
 */
public class Item {

    // Declare fields with appropriate access modifiers
    private String name;
    private String genre;
    private int stockCount;
    private String serialCode;

    public Item(String name, String genre, int stockCount, String serialCode) {
        this.name = name;
        this.genre = genre;
        this.stockCount = stockCount;
        this.serialCode = serialCode;
    }

    // Public getters for name, genre, stockCount only
    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getStockCount() {
        return stockCount;
    }

    /**
     * Package-private: accessible within game.inventory, hidden from outside.
     * Used by Inventory for auditing purposes.
     */
    String getSerialCode() {
        return serialCode;
    }

    /**
     * Private helper: checks whether enough stock exists.
     */
    private boolean isAvailable(int quantity) {
        return stockCount >= quantity;
    }

    /**
     * Reduces stock by the given quantity if available.
     * Prints a warning if stock is insufficient.
     */
    public void sell(int quantity) {
        if (isAvailable(quantity)) {
            stockCount -= quantity;
            System.out.println("Sold " + quantity + " copy/copies of " + name + ". Remaining stock: " + stockCount);
        } else {
            System.out.println("WARNING: Not enough stock for " + name + ". Requested: " + quantity + ", Available: " + stockCount);
        }
    }
}