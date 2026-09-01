package mate.academy

data class CoffeeCup(
    var clientName: String = "", var coffeeType: String = "Unknown", var isServed: Boolean = false
) {
    // Method to simulate serving coffee
    fun serveCoffee() {
        print("Serving a $coffeeType to $clientName. Served: $isServed\n")
    }
}
