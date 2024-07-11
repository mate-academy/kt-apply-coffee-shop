package mate.academy

// A class representing a CoffeeCup
data class CoffeeCup(
    var clientName: String = "",
    var coffeeType: String = "Unknown",
    var isServed: Boolean = false
) {
    fun serveCoffee() {
        print("Serving a $coffeeType to $clientName. Served: $isServed\n")
    }
}
