public class lesson_14_09 {
    //Удаление элемента в цикле for-each
    //У цикла for-each есть один минус: он не умеет правильно удалять элементы. Если вы напишете такой код, получите ошибку.

    //  ArrayList<String> list = new ArrayList<String>();

    //  list.add("Привет");
    //  list.add("Hello");
    //  list.add("Hola");
    //  list.add("Bonjour");
    //  list.add("Cialo");
    //  list.add("Namaste");

    //  for (String str: list)
    //  {
    //      if (str.equals("Hello"))
    //          list.remove(str);
    //  }

    //Нельзя менять коллекцию, пока вы обходите ее с помощью итератора.

    //Есть три способа обойти это ограничение.
    //1 Использование другого цикла
    //Если вы обходите коллекцию ArrayList, можете воспользоваться обычным циклом со счетчиком i.
    //При этом нужно уменьшить i, т.к. после удаления элементы сдвинутся
    //for (int i = 0; i < list.size(); i++)
    //{
    //   String str = list.get(i);
    //
    //   if (str.equals("Hello"))
    //   {
    //      list.remove(str);
    //      i--;
    //   }
    //}

    //2 Явное использование итератора
    //Можно использовать итератор явно и задействовать его метод remove().
    //Iterator<String> it = set.iterator();
    //while (it.hasNext())
    //{
    //   String str = it.next();
    //   if (str.equals("Hello"))
    //       it.remove();
    //}

    //3 Использование копии коллекции
    //Также вы можете создать копию коллекции и использовать в цикле for-each коллекцию-копию, а удалять элементы из оригинальной коллекции.
    //ArrayList<String> listCopy = new ArrayList(list);
    //for (String str: listCopy)
    //{
    //   if (str.equals("Hello"))
    //      list.remove(str);
    //}

    //Копия коллекции создается довольно быстро: элементы при копировании коллекции не дублируются,
    //в новой коллекции будут храниться ссылки на те же элементы, что и в старой.
}
