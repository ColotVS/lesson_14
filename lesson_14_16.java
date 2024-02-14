public class lesson_14_16 {
    //Методы класса Collections

    //Поиск элементов в коллекциях

    //Метод Collections.min(Collection<T> colls)
    //Метод min() возвращает минимальный элемент коллекции.

    //  ArrayList<Integer> list = new ArrayList<Integer>();
    //  Collections.addAll(list, 11, 2, 23, 4, 15);
    //  int min = Collections.min(list);
    //  System.out.println(min);


    //Метод Collections.max(Collection<T> colls)
    //Метод max() возвращает максимальный элемент коллекции.

    //  ArrayList<Integer> list = new ArrayList<Integer>();
    //  Collections.addAll(list, 11, 2, 23, 4, 15);
    //  int max = Collections.max(list);
    //  System.out.println(max);


    //Метод Collections.frequency(Collection<T> colls, T obj)
    //Метод frequency() подсчитывает, сколько раз в коллекции colls встречается элемент obj

    //  ArrayList<Integer> list = new ArrayList<Integer>();
    //  Collections.addAll(list, 11, 2, 23, 4, 15, 4, 2, 4);
    //  int count = Collections.frequency(list, 4);
    //  System.out.println(count);


    //Метод Collections.binarySearch(List<T> list, T key)
    //Метод binarySearch() ищет элемент key в списке list.
    //Возвращает номер найденного элемента. Если элемент не найден, возвращает отрицательное число.
    //Перед вызовом метода binarySearch() список нужно отсортировать (Collections.sort()).

    //  ArrayList<Integer> list = new ArrayList<Integer>();
    //  Collections.addAll(list, 11, 2, 23, 5, 15, 4, 2, 4);
    //  Collections.sort(list);  // 2, 2, 4, 4, 5, 11, 15, 23
    //  int index = Collections.binarySearch(list, 5);    // 4
    //  System.out.println(index);
    //  int index2 = Collections.binarySearch(list, 15);  // 6
    //  System.out.println(index2);
    //  int index3 = Collections.binarySearch(list, 16);  // нет
    //  System.out.println(index3);


    //Метод Collections.disjoint(Collection<T> coll1, Collection<T> coll2)
    //Метод disjoint() возвращает true, если у переданных коллекций нет одинаковых элементов.

    //  ArrayList<Integer> list = new ArrayList<Integer>();
    //  Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7);
    //  ArrayList<Integer> list2 = new ArrayList<Integer>();
    //  Collections.addAll(list2, 99, 98, 97);
    //  boolean isDifferent = Collections.disjoint(list, list2);
    //  System.out.println(isDifferent);
}
