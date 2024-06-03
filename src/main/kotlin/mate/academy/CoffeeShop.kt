package mate.academy

class CoffeeShop {
    fun sellCoffee(clientName: String, coffeeType: String): CoffeeCup {
        return CoffeeCup().apply {
            this.coffeeType = coffeeType
            this.clientName = clientName
            this.isServed = true
            serveCoffee()
        }
    }
}
