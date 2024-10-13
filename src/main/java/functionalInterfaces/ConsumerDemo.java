package functionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        // все функциональные интерфейсы принимают на вход значение и логику (что делать со значениями когда просят)
        // разница Consumer - ничего не возвращает (можно сохранить в файл, вывести в консоль)

        List<String> names = List.of("Иван", "Петр", "Сергей", "Алексей");

        java.util.function.Consumer<String> cons1 = s -> System.out.println("*** " + s + " ***");
        java.util.function.Consumer<String> cons2 = s -> System.out.println("$$$ " + s + " $$$");

        for (String name : names) {
            printName(name, cons2);
        }

        // пример как используется
        names.forEach(n -> {
            System.out.println(n);
        });

        List<Integer> numbers = List.of(1, 2, 3, 4);
        Consumer<Integer> cons3 = integer -> System.out.println(integer + 1);

        for (Integer number : numbers) {
            printNumber(number, cons3);
        }

        Item iron = new Item("Утюг", 100, 50);

        Consumer<Item> itemConsumer = item -> System.out.println(item.name());
        itemConsumer.accept(iron);
    }

    public static void printName(String name, Consumer<String> action) {
        action.accept(name);
    }

    public static void printNumber(Integer number, Consumer<Integer> action) {
        action.accept(number);
    }

}