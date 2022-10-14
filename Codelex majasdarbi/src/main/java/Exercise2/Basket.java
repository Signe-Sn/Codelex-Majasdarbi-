package Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {

    List<T> list = new ArrayList<>();

    int amountOfItemsInBasket = 0;

    public Basket() {
    }

    public void addToBasket(T item) throws BasketFullException {
        if (amountOfItemsInBasket == 10) {
            throw new BasketFullException("Basket is full");
        }
        list.add(item);
        amountOfItemsInBasket++;
    }

    public void removeFromBasket(int index) throws BasketEmptyException {
        if (amountOfItemsInBasket == 0) {
            throw new BasketEmptyException("Basket is empty!");
        }
        list.remove(index);
        amountOfItemsInBasket--;
    }

    public int getAmountOfItemsInBasket() {
        return amountOfItemsInBasket;
    }
}
