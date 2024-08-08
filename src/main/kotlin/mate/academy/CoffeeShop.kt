package mate.academy

// A class representing a CoffeeShop
class CoffeeShop {

    fun sellCoffee(clientName: String, coffeeType: String): CoffeeCup {
        val coffeeCup = CoffeeCup().apply {
            this.clientName = clientName
            this.coffeeType = coffeeType
            isServed = true
            serveCoffee()
        }
        return  coffeeCup
    }
}
