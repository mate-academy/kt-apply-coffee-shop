package mate.academy

// A class representing a CoffeeShop
class CoffeeShop {

    // Method to sell coffee to a client
    fun sellCoffee(clientName: String, coffeeType: String): CoffeeCup {
        // Create and initialize a CoffeeCup, then apply the serve action
        val coffeeCup = CoffeeCup().apply {
            this.coffeeType = coffeeType
            this.clientName = clientName
            isServed = true
            serveCoffee()
        }
        return coffeeCup
    }
}
