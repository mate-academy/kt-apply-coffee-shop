package mate.academy

class CoffeeShop {

    fun sellCoffee(clientName: String, coffeeType: String): CoffeeCup {
        return CoffeeCup().apply {
            this.clientName = clientName
            this.coffeeType = coffeeType
            this.isServed = true
            this.serveCoffee()
        }
    }
}
