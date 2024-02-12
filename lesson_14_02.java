import java.util.HashSet;
import java.util.Scanner;

public class lesson_14_02 {
    //Коллекция HashSet
    //Класс HashSet является типичным представителем коллекций типа «множество».
    //Во многом он похож на класс ArrayList, и в каком-то смысле является его более примитивной версией.

    //Создать объект типа HashSet можно с помощью команды вида:
    //HashSet<Тип> имя = new HashSet<Тип>();
    //Где тип — это тип элементов, которые можно хранить в коллекции HashSet.

    //У класса HashSet есть такие методы:
    //Метод	                        Описание
    //boolean add(Тип value)        Добавляет элемент value в коллекцию
    //boolean remove(Тип value)     Удаляет элемент value из коллекции.Возвращает true, если там такой элемент был
    //boolean contains(Тип value)   Проверяет, есть ли в коллекции элемент value
    //void clear()                  Очищает коллекцию: удаляет все элементы
    //int size()                    Возвращает количество элементов в коллекции

    //Пример использования множества.
    //Давайте напишем программу, которая прощается с пользователем, если он с ней поздоровался: если пользователь сказал привет.
    //Для большего интереса «привет» можно будет говорить на нескольких языках.
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("Привет");
        set.add("Hello");
        set.add("Hola");
        set.add("Bonjour");
        set.add("Cialo");
        set.add("Namaste");

        Scanner console = new Scanner(System.in);
        String str = console.nextLine();

        if (set.contains(str))
            System.out.println("И тебе привет!");
    }
}
