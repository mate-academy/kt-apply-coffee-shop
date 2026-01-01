package mate.academy

data class CoffeeCup(
    var clientName: String = "",
    var coffeeType: String = "Unknown",
    var isServed: Boolean = false
) {
    fun serveCoffee() {
        isServed = true
        print("Serving a $coffeeType to $clientName. Served: $isServed\n")
    }
}
