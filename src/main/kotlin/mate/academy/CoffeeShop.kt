package mate.academy

// A class representing a CoffeeShop
class CoffeeShop {

    fun sellCoffee(clientName: String, coffeeType: String): CoffeeCup = CoffeeCup().apply {
        this.clientName = clientName
        this.coffeeType = coffeeType
        isServed = true
        serveCoffee()
    }
}
