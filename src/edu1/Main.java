package edu1;

public class Main {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);
        Printer.print(cats);

        // А сюда добавьте код, который будет сортировать коллекцию котов
        // используйте лямбда-выражения и ссылки на методы
        //cats.sort(?);
        //Printer.print(cats);

//        СОРТИРОВКА ПО ПОРОДЕ КОТА
        cats.sort((b1, b2) -> b1.getBreed().compareTo(b2.getBreed()));
        Printer.print(cats);

        cats.sort(Cat::byBreed);
        Printer.print(cats);

//        СОРТИРОВКА ПО ИМЕНИ И ВОЗРАСТВУ
        cats.sort((c1, c2) ->
        {
            if (c1.getName().equals(c2.getName())) {
                return c1.getAge() - c2.getAge();
            }
            return c1.getName().compareTo(c2.getName());
        });
        Printer.print(cats);

        cats.sort(Cat::byNameAndAge);
        Printer.print(cats);

//        Удалять из списка всех котов определенного цвета
        var color = Cat.Color.TABBY;
        cats.removeIf((c1)->c1.getColor().equals(color));
        Printer.print(cats);

//        Удалять из списка всех котов, длина имени которого равна 5.
        cats.removeIf((c1)->c1.getName().length()==5);
        Printer.print(cats);

    }
}
