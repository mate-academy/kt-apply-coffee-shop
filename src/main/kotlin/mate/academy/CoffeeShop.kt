package mate.academy

// A class representing a CoffeeShop
class CoffeeShop {

    // Method to sell coffee to a client
    fun sellCoffee(clientName: String, coffeeType: String): CoffeeCup {
        val coffeeCup = CoffeeCup(clientName, coffeeType, true).apply {
            serveCoffee()
        }
        return coffeeCup

    }

}
