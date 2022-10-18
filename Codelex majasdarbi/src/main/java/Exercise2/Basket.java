package Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {

    List<T> list = new ArrayList<>();

    public Basket() {
    }

    public void addToBasket(T item) throws BasketFullException {
        if (list.size() >= 10) {
            throw new BasketFullException("Basket is full");
        }
        list.add(item);
    }

    public void removeFromBasket(int index) throws BasketEmptyException {
        if (list.size() == 0) {
            throw new BasketEmptyException("Basket is empty!");
        }
        list.remove(index);
    }

    public int getAmountOfItemsInBasket() {
        return list.size();
    }
}
