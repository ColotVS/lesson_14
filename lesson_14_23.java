public class lesson_14_23 {
    //Знакомство с коллекцией LinkedList

    //В Java есть еще один класс-коллекция, который достался Java в наследство от языка C++.
    //Это класс LinkedList, что переводится как «Связный Список».
    //Внешне LinkedList — это такой же список, как и ArrayList.
    //У класса LinkedList есть все те же методы, что и у класса ArrayList.
    //И в принципе вы всегда можете использовать LinkedList вместо ArrayList, и все будет работать.
    //Так зачем же нужен еще один класс-список?
    //Все дело во внутреннем устройстве класса LinkedList.
    //Вместо массива там используется двусвязный список.
    //Но за счет другого внутреннего устройства у класса LinkedList — самая быстрая операция вставки элементов в середину списка.
    //В интернете часто можно найти такое сравнение классов ArrayList и LinkedList:

    //Операция	                    Метод	            ArrayList	            LinkedList
    //Добавление элемента           add(value)          Быстро	                Очень быстро
    //Вставка элемента              add(index, value)   Медленно	            Очень быстро
    //Получение элемента            get(index)          Очень быстро	        Медленно
    //Изменение элемента            set(index, value)   Очень быстро	        Медленно
    //Удаление элемента             remove(index)       Медленно	            Очень быстро


}
