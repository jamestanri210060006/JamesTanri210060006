class BuildingStore {
    // Private variables
    private var itemName: String = "Unknown"
    private var itemPrice: Int = 0
    private var stock: Int = 0

    // Getter and Setter for item name
    fun getItemName(): String {
        return itemName
    }

    fun setItemName(value: String) {
        itemName = value
    }

    // Getter and Setter for item price
    fun getItemPrice(): Int {
        return itemPrice
    }

    fun setItemPrice(value: Int) {
        if (value > 0) {
            itemPrice = value
        } else if (value <= -1000) {
            println("It is cannot be less than 1000.0")
        } else {
            println("Price cannot be negative or zero")
        }
    }

    // Getter and Setter for stock
    fun getStock(): Int {
        return stock
    }

    fun setStock(value: Int) {
        if (value >= 0) {
            stock = value
        } else if (value <= 0) {
            println("It is impossible to order negative or zero")
        } else {
            println("Stock cannot be negative")
        }
    }

    // Read-only property
    val isAvailable: Boolean
        get() = stock > 0
}

fun main() {
    val store = BuildingStore()

    // Set values
    store.setItemName("Cement")
    store.setItemPrice(63000)
    store.setStock(5)

    // Display item information
    println("=== Building Store Project ===")
    println("Item Name : ${store.getItemName()}")
    println("Item Price: Rp ${store.getItemPrice()}")
    println("Stock     : ${store.getStock()}")
    println("Available : ${store.isAvailable}")

    // Testing validation
    println("\n=== Validation Test ===")

    store.setStock(20) // Invalid stock
    println("Current Stock: ${store.getStock()}")

    store.setItemPrice(63000) // Invalid price
    println("Current Price: Rp ${store.getItemPrice()}")
}