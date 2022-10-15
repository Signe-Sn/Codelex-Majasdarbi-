import Exercise2.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BasketTest {

    @Test
    void basketTest() throws BasketFullException {
        Basket<Apple> appleBasket = new Basket<>();
        appleBasket.addToBasket(new Apple());

        Basket<Mushroom> mushroomBasket = new Basket<>();
        mushroomBasket.addToBasket(new Mushroom());
        Assertions.assertEquals(appleBasket.getAmountOfItemsInBasket() == 1, appleBasket.getAmountOfItemsInBasket() == 1);
        Assertions.assertEquals(mushroomBasket.getAmountOfItemsInBasket() == 1, mushroomBasket.getAmountOfItemsInBasket() == 1);
    }

    @Test
    void testEmptyBasket() {
        Basket<Apple> basket = new Basket<>();

        Exception exception = assertThrows(BasketEmptyException.class, () -> basket.removeFromBasket(0));
        assertEquals("Basket is empty!", exception.getMessage());
    }

    @Test
    void testFullBasket() throws BasketFullException {
        Basket<Apple> basket = new Basket<>();
        basket.addToBasket(new Apple());
        basket.addToBasket(new Apple());
        basket.addToBasket(new Apple());
        basket.addToBasket(new Apple());
        basket.addToBasket(new Apple());
        basket.addToBasket(new Apple());
        basket.addToBasket(new Apple());
        basket.addToBasket(new Apple());
        basket.addToBasket(new Apple());
        basket.addToBasket(new Apple());

        Exception exception = assertThrows(BasketFullException.class, () -> basket.addToBasket(new Apple()));
        assertEquals("Basket is full", exception.getMessage());
    }
}