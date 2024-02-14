public class lesson_14_12 {
    //Методы класса Collections

    //Создание и изменение коллекций
    //Метод Collections.addAll(Collection<T> colls, T e1, T e2, T e3, ...)
    //Метод addAll() добавляет в коллекцию colls элементы e1, e2, e3, ... Количество переданных элементов может быть любым.

    //  ArrayList<Integer> list = new ArrayList<Integer>();
    //  Collections.addAll(list, 1, 2, 3, 4, 5);
    //  for (int i: list)
    //      System.out.println(i);


    //Метод Collections.fill(List<T> list, T obj)
    //Метод fill() заменяет все элементы коллекции list на элемент obj.

    //  ArrayList<Integer> list = new ArrayList<Integer>();
    //  list.add(1);
    //  list.add(2);
    //  list.add(3);
    //  Collections.fill(list, 10);
    //  for (int i: list)
    //      System.out.println(i);


    //Метод Collections.nCopies (int n, T obj)
    //Метод nCopies() возвращает список из n копий элементов obj.
    //Список можно назвать фиктивным (реального массива внутри нет), поэтому изменять его нельзя! Можно использовать только для чтения.

    //  List<String> fake = Collections.nCopies(5, "Привет");
    //  ArrayList<String> list = new ArrayList<String>(fake);
    //  for(String s: list)
    //      System.out.println(s);


    //Метод Collections.replaceAll (List<T> list, T oldValue, T newValue)
    //Метод replaceAll() заменяет все элементы коллекции list, равные oldValue, на элемент newValue.

    //  ArrayList<Integer> list = new ArrayList<Integer>();
    //  list.add(1);
    //  list.add(2);
    //  list.add(3);
    //  Collections.replaceAll(list, 2, 20);
    //  for (int i: list)
    //      System.out.println(i);


    //Метод Collections.copy (List<T> dest, List<T> src)
    //Метод copy() копирует все элементы коллекции src в коллекцию dest.
    //Если изначально коллекция dest длиннее чем коллекция src, то оставшиеся элементы в коллекции dest останутся нетронутыми.
    //Коллекция dest должна иметь длину не меньше, чем длина коллекции src (иначе кинется исключение IndexOutOfBoundsException).

    //  ArrayList<Integer> srcList = new ArrayList<Integer>();
    //  Collections.addAll(srcList, 99, 98, 97);
    //  ArrayList<Integer> destList = new ArrayList<Integer>();
    //  Collections.addAll(destList, 1, 2, 3, 4, 5, 6, 7);
    //  Collections.copy(destList, srcList);
    //  for (int i: destList)
    //      System.out.println(i);
}
