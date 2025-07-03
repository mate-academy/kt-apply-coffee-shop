package mate.academy

class CoffeeShop {

    fun sellCoffee(clientName: String, coffeeType: String): CoffeeCup {
        var coffeeCup: CoffeeCup = CoffeeCup().apply {
            this.clientName = clientName
            this.coffeeType = coffeeType
            this.isServed = true
            serveCoffee()
        }
        return coffeeCup
    }
}
