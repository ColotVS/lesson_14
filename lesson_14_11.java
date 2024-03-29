public class lesson_14_11 {
    //Вспомогательный класс Collections

    //В Java есть класс java.util.Collections, у которого очень много методов, полезных при работе с коллекциями.
    //Ниже приведем только самые интересные из них:

    //Методы	                        Описание
    //addAll(colls, e1, e2, e3, ..)     Добавляет в коллекцию colls элементы e1, e2, e3,...
    //fill(list, obj)                   Заменяет в переданном списке все элементы на obj
    //nCopies(n, obj)                   Возвращает список, состоящий из n копий объекта obj
    //replaceAll(list, oldVal, newVal)  Заменяет в списке list все значения oldVal на newVal
    //copy(dest, src)                   Копирует все элементы из списка src в список dest
    //reverse(list)                     Разворачивает список задом наперед
    //sort(list)                        Сортирует список в порядке возрастания
    //rotate(list, n)                   Циклично сдвигает элементы списка list на n элементов
    //shuffle(list)                     Случайно перемешивает элементы списка
    //min(colls)                        Находит минимальный элемент коллекции colls
    //max(colls)                        Находит максимальный элемент коллекции colls
    //frequency(colls, obj)             Определяет, сколько раз элемент obj встречается в коллекции colls
    //binarySearch(list, key)           Ищет элемент key в отсортированном списке, возвращает индекс.
    //disjoint(colls1, colls2)          Возвращает true, если у коллекций нет общих элементов

    //Многие из этих методов работают не с классами ArrayList, HashSet и HashMap, а с их интерфейсами: Collection<T>, List<T>, Map<K, V>.
    //Это не проблема: если метод принимает List<T>, в него всегда можно передать ArrayList<Integer>,
    //но вот в обратную сторону присваивание не работает.

}
