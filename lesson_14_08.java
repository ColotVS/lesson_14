import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class lesson_14_08 {
    //Цикл for-each

    //Основной минус итератора в том, что с его использованием код получается еще более громоздким, чем с использованием цикла for.
    //Давайте для сравнения выведем на экран список с помощью цикла for и с помощью итератора:

    //Итератор	                                                    Цикл for
    //ArrayList<String> list = new ArrayList<String>();             ArrayList<String> list = new ArrayList<String>();
    //Iterator<String> it = list.iterator();                        for (int i = 0; i < list.size(); i++)
    //while (it.hasNext())                                          {
    //{                                                             String str = list.get(i);
    //   String str = it.next();                                    System.out.println(str);
    //   System.out.println(str);                                   }
    //}

    //Да, элементы списка ArrayList гораздо лучше обходить с помощью цикла — все короче получается.

    //Однако разработчики Java решили добавить в Java новый вид циклов и назвали его for-each.
    //Вот как выглядит его использование в общем случае:
    //for(Тип имя:коллекция)
    //Где коллекция — это имя переменной коллекции, Тип — это тип элементов коллекции, а имя — это имя переменной,
    //которая на каждом витке цикла принимает очередное значение из коллекции.

    //Этот цикл обходит все элементы коллекции с помощью скрытого итератора. Вот как он на самом деле работает:

    //Цикл for-each
    //ArrayList<String> list = new ArrayList<String>();
    //for (String str: list)
    //{
    //   System.out.println(str);
    //}

    //Что видит компилятор: Цикл с итератором
    //ArrayList<String> list = new ArrayList<String>();
    //Iterator<String> it = list.iterator();
    //while (it.hasNext())
    //{
    //   String str = it.next();
    //   System.out.println(str);
    //}

    //Когда компилятор встретит в вашем коде цикл for-each, он просто заменит его:
    //добавит метод получения итератора и все недостающие вызовы методов.

    //В классе lesson_14_08 есть методы printHashSet(HashSet<String>) и printList(ArrayList<String>),
    //которые выводят все элементы из переданных коллекций — списка и множества — с новой строки.
    //Твоя задача переписать методы на использование цикла for-each.
    //Метод main не участвует в проверке.
    public static void printList(ArrayList<String> words) {
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void printHashSet(HashSet<String> words) {
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        String[] wordsArray = "Думаю, это будет новой фичей. Только не говорите никому, что она возникла случайно.".split(" ");
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));
        HashSet<String> wordsHashSet = new HashSet<>(wordsList);
        printList(wordsList);
        System.out.println("__________________________________");
        printHashSet(wordsHashSet);
    }
}
