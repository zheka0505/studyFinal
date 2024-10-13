package record;

public record Example(int id, String name) {

    //record - используется, когда не надо менять состояние (то есть значения объекта класса), конструктор и гетеры, печать норм


    //можно добавлять методы
    public static String methodExample(int id){
        return "Пример";
    }

}
