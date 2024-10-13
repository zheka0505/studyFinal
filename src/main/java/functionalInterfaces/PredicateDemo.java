package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        // все функциональные интерфейсы принимают на вход значение и логику (что делать со значениями когда просят)
        // разница Predicate - возвращает true/false, используется при фильтрации

        Item item1 = new Item("Яблоко", 20, 80);
        Item item2 = new Item("Груша", 120, 70);
        Item item3 = new Item("Апельсин", 110, 75);

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

        // >= 75 / < 111

        Predicate<Item> priceIsLessThan111 = new Predicate <Item>() {
            public boolean test(Item i) {
                return i.price() < 111;
            }
        };

        Predicate <Item> ratingIsGreaterThan71 = i -> i.rating() > 71;


        List<Item> filtered = filter(items, priceIsLessThan111);

    }

    public static List<Item> filter(List<Item> allItems, Predicate<Item> rule) {
        List<Item> filtered = new ArrayList<>();

        for (Item item : allItems) {
            if (rule.test(item)) {
                filtered.add(item);
            }
        }

        return filtered;
    }
}