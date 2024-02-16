import java.util.ArrayList;
import java.util.HashMap;

public class lesson_14_22 {
    //Сравнение ArrayList vs HashMap.
    //HashMap сильно напоминает ArrayList, у которого в качестве индексов используются не цифры, а слова (или другой тип ключей)
    //А если в качестве ключа в HashMap использовать Integer, он становится еще более похожим на ArrayList. Сравните:

    //Код с ArrayList<String>	                                    Код с HashMap<Integer, String>
    //ArrayList<String> list = new ArrayList<String>();             HashMap<Integer, String> map = new HashMap<Integer, String>();
    //list.add("Привет");                                           map.put(0, "Привет");
    //list.add("Hello");                                            map.put(1, "Hello");
    //String s = list.get(0);                                       String s = map.get(0);
    //list.set(0, s + "!");                                         map.put(0, s + "!");
    //for (String item: list)                                       for (String item: map.values())
    //{                                                             {
    //   System.out.println(item);                                      System.out.println(item);
    //}                                                             }

    //В классе lesson_14_22 есть метод getProgrammingLanguages, который возвращает список языков программирования.
    //Тебе нужно переписать этот метод, чтобы он возвращал HashMap<Integer, String>.
    //Ключом в этой коллекции будет индекс элемента в ArrayList.

    public static void main(String[] args) {
        HashMap<Integer, String> programmingLanguages = getProgrammingLanguages();
        System.out.println("Топ языков программирования:");
        for (var pair: programmingLanguages.entrySet())
        {
            Integer index = pair.getKey()+1;
            String languages = pair.getValue();
            System.out.println(index + " -> " + languages);
        }
    }

    public static HashMap<Integer, String> getProgrammingLanguages() {
        HashMap<Integer, String> programmingLanguages = new HashMap<>();
        programmingLanguages.put(0, "Java");
        programmingLanguages.put(1, "Kotlin");
        programmingLanguages.put(2, "Go");
        programmingLanguages.put(3, "Javascript");
        programmingLanguages.put(4, "Typescript");
        programmingLanguages.put(5, "Python");
        programmingLanguages.put(6, "PHP");
        programmingLanguages.put(7, "C++");
        return programmingLanguages;
    }
}
