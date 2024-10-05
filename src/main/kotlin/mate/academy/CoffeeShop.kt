package mate.academy

// A class representing a CoffeeShop
class CoffeeShop {

    fun sellCoffee(clientName: String, coffeeType: String): CoffeeCup {
        return CoffeeCup().apply {
            isServed = true
            this.clientName = clientName
            this.coffeeType = coffeeType
            serveCoffee()
        }
    }
}
