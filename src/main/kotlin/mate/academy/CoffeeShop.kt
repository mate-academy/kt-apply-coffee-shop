package mate.academy

// A class representing a CoffeeShop
class CoffeeShop {

    // Method to sell coffee to a client
    fun sellCoffee(clientName: String, coffeeType: String): CoffeeCup {
        return CoffeeCup().apply {
            this.coffeeType = coffeeType
            this.clientName = clientName
            this.isServed = true
            serveCoffee()
        }

    }
}
