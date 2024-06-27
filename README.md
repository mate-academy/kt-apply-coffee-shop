# Coffee shop selling coffee with `apply` function

Let's build a simple coffee shop simulation.

Your task is to implement the `sellCoffee()` function in the `CoffeeShop` class. This function should create a
new `CoffeeCup`, set its attributes, and serve the coffee using the Kotlin `apply` scope function.

## Requirements:

- The `CoffeeShop` class has to be defined using the `sellCoffee()` method.
- The `sellCoffee()` method should accept a `clientName` and `coffeeType`.
- In the `sellCoffee()` function create a `CoffeeCup` instance and initialize its attributes (`clientName`, `coffeeType`, `isServed`).
- Use the `apply` scope function to set the properties of `CoffeeCup` and call the `serveCoffee` method.
- Return the initialized `CoffeeCup`.

## Implementation details

- The `CoffeeCup` class should represent a cup of coffee with attributes like `clientName`, `coffeeType`, and `isServed`.
- The `CoffeeShop` class should have a `sellCoffee()` method, which creates a `CoffeeCup`, sets its attributes, and serves it.
