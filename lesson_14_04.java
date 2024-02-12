import java.util.HashSet;

import static java.util.Arrays.asList;

public class lesson_14_04 {
    //Множество

    //Коллекция Set создана для хранения множества элементов.
    //Поэтому ее так и называют Set (множество).
    //У этой коллекции есть три особенности.

    //Операции над множеством
    //С множеством можно делать только три операции: добавлять элементы во множество, удалять элементы из множества и проверять,
    //есть ли во множестве определенный элемент.

    //Отсутствие порядка
    //У элементов этой коллекции нет номеров.
    //Нельзя получить элемент по его индексу или записать значение в коллекцию по определенному индексу.
    //Методов get() и set() у множества нет.

    //Уникальность элементов
    //Все элементы множества уникальны. В отличие от списка, во множестве один элемент может быть только раз.
    //Объект или находится во множестве, или нет: третьего не дано. Нельзя во «множество цветов» трижды добавить «черный цвет».
    //Он там либо есть, либо его нет.

    //Поиск элементов
    //Когда вы добавляете во множество новый элемент, удаляете элемент,
    //или проверяете наличие элемента, внутри метода выполняется поиск элемента.
    //Элементы коллекции и переданный элемент сравниваются сначала по hashCode(), а если hashCode() совпадают, по equals.

    //В классе lesson_14_04 есть метод checkWords(String), который должен проверять наличие переданного слова в множестве words.
    //Если слово есть, то выводим в консоль:
    //Слово [переданное слово] есть в множестве
    //Если нет:
    //Слова [переданное слово] нет в множестве
    //Метод main не участвует в проверке.
    //Пример вывода:
    //Слово Java есть в множестве
    public static HashSet<String> words = new HashSet<>(asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".split(" ")));

    public static void checkWords(String word) {
            if (words.contains(word)) {System.out.println("Слово "+word+" есть в множестве");}
            else {System.out.println("Слова "+word+" нет в множестве");}
        }


    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }
}