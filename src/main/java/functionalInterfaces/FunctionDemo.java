package functionalInterfaces;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {

    // все функциональные интерфейсы принимают на вход значение и логику (что делать со значениями когда просят)
    // разница Function - возвращает значение, используется в маппинге

    public static void main(String[] args) {

        List<String> names = List.of("Галина", "Данила", "Никита", "Анна", "Милана");

        Function<String, String> upperCase = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };

        Function<String, String> lowerCase = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toLowerCase();
            }
        };

        Function<String, String> countSymbols = s -> String.valueOf(s.length());


        List<String> mapped = map(names, lowerCase);
        System.out.println(mapped);


    }

    public static List<String> map(List<String> allNames, Function<String, String> rule) {
        List<String> result = new ArrayList<>();

        for (String name : allNames) {
            String res = rule.apply(name);
            result.add(res);
        }

        return result;
    }
}
