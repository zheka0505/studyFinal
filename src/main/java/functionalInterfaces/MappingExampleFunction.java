package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MappingExampleFunction {

    public static void main(String[] args) {


        Item item1 = new Item("Яблоко", 200, 80);
        Item item2 = new Item("Груша", 120, 50);
        Item item3 = new Item("Апельсин", 110, 75);

        List<Item> items = List.of(item1, item2, item3);

        Function<Item, String> humanReadableStatus = item -> {
            if (item.rating() >= 80) {
                return "PERFECT";
            }

            if (item.rating() <= 50) {
                return "BAD";
            }

            return "GOOD";
        };

        System.out.println(map(items, humanReadableStatus));




    }


    private static List<String> map(List<Item> items, Function<Item, String> mappingRule) {
        List<String> result = new ArrayList<>();

        for (Item item : items) {
            String rating = mappingRule.apply(item);
            result.add(item.name() + " " + rating);
        }

        return result;

    }
}

