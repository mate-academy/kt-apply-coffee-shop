package mate.academy

class CoffeeShop {

    fun sellCoffee(clientName: String, coffeeType: String): CoffeeCup {
        return CoffeeCup().apply {
            this.coffeeType = coffeeType
            this.clientName = clientName
            isServed = true
            serveCoffee()
        }
    }
}
