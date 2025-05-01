package mate.academy

// A class representing a CoffeeShop
class CoffeeShop {

    // Method to sell coffee to a client
    fun sellCoffee(clientName: String, coffeeType: String): CoffeeCup {
        return CoffeeCup(clientName, coffeeType).apply {
            isServed = true
            serveCoffee()
        }

    }
}
