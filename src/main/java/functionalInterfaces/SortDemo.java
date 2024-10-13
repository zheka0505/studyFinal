package functionalInterfaces;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortDemo {

    //Сортировка

    public static void main(String[] args) {

        Item item1 = new Item("Яблоко", 100, 80);
        Item item2 = new Item("Груша", 120, 70);
        Item item3 = new Item("Апельсин", 110, 75);

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

        /// вывести товары на экран по цене / по рейтингу / по названию


        //arg -> algoritm
        //(a,b) -> a.price() - b.price()


        items.sort((a,b) -> a.price() - b.price());
        items.sort((a,b) -> a.rating() - b.rating());
        items.sort(Comparator.comparing(s -> s.toString()).reversed());

        System.out.println(items);


    }
}
