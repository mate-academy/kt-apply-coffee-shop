package mate.academy

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.assertEquals
import kotlin.test.assertNotSame

class CoffeeShopTest {
    private lateinit var coffeeShop: CoffeeShop
    private lateinit var outputStream: ByteArrayOutputStream

    @BeforeEach
    fun setup() {
        coffeeShop = CoffeeShop()
        outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))
    }

    @AfterEach
    fun tearDown() {
        System.setOut(System.out)
    }

    @Test
    fun `sell coffee with common client name and coffee type`() {
        coffeeShop.sellCoffee("Alice", "Espresso")
        assertEquals("Serving a Espresso to Alice. Served: true\r\n", outputStream.toString())
    }

    @Test
    fun `sell coffee with empty client name`() {
        coffeeShop.sellCoffee("", "Latte")
        assertEquals("Serving a Latte to . Served: true\r\n", outputStream.toString())
    }

    @Test
    fun `sell coffee with empty coffee type`() {
        coffeeShop.sellCoffee("Bob", "")
        assertEquals("Serving a  to Bob. Served: true\r\n", outputStream.toString())
    }

    @Test
    fun `sell coffee with whitespace-only client name`() {
        coffeeShop.sellCoffee("   ", "Cappuccino")
        assertEquals("Serving a Cappuccino to    . Served: true\r\n", outputStream.toString())
    }

    @Test
    fun `re-sell coffee to same client`() {
        coffeeShop.sellCoffee("Eve", "Flat White")
        coffeeShop.sellCoffee("Eve", "Flat White")
        assertEquals(
            "Serving a Flat White to Eve. Served: true\r\nServing a Flat White to Eve. Served: true\r\n",
            outputStream.toString()
        )
    }

    @Test
    fun `validate returned coffee cup client name`() {
        val coffeeShop = CoffeeShop()
        val coffeeCup = coffeeShop.sellCoffee("Alice", "Espresso")
        assertEquals("Alice", coffeeCup.clientName)
    }

    @Test
    fun `validate returned coffee cup coffee type`() {
        val coffeeShop = CoffeeShop()
        val coffeeCup = coffeeShop.sellCoffee("Bob", "Americano")
        assertEquals("Americano", coffeeCup.coffeeType)
    }

    @Test
    fun `validate returned coffee cup is served`() {
        val coffeeShop = CoffeeShop()
        val coffeeCup = coffeeShop.sellCoffee("Charlie", "Latte")
        assertEquals(true, coffeeCup.isServed)
    }

    @Test
    fun `ensure unique coffee cup instances are returned`() {
        val coffeeShop = CoffeeShop()
        val coffeeCup1 = coffeeShop.sellCoffee("Alice", "Espresso")
        val coffeeCup2 = coffeeShop.sellCoffee("Bob", "Americano")
        assertNotSame(coffeeCup1, coffeeCup2)
    }

    @Test
    fun `consistent behavior after multiple calls`() {
        val coffeeShop = CoffeeShop()
        val coffeeCup1 = coffeeShop.sellCoffee("Dave", "Mocha")
        val coffeeCup2 = coffeeShop.sellCoffee("Dave", "Mocha")
        assertEquals(coffeeCup1.clientName, coffeeCup2.clientName)
        assertEquals(coffeeCup1.coffeeType, coffeeCup2.coffeeType)
        assertEquals(coffeeCup1.isServed, coffeeCup2.isServed)
    }
}
