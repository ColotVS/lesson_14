import java.util.HashMap;

public class lesson_14_21 {
    //Использование цикла по парам

    //Есть и более сложный способ: можно преобразовать Map в множество пар элементов,
    //а потом использовать цикл по элементам множества, как мы уже раньше учили.
    //В коллекции HashMap есть вспомогательный класс для хранения пары элементов. Выглядит он примерно так:
    //  class Entry<KeyType, ValueType>
    //  {
    //      private KeyType key;
    //      private ValueType value;
    //
    //      public KeyType getKey()
    //      {
    //          return this.key;
    //      }
    //
    //      public ValueType getValue()
    //      {
    //          return this.value;
    //      }
    //  }

    //Результат вызова метода entrySet() у объекта типа HashMap<ТКлюч, ТЗначение> будет иметь тип Set<Entry<ТКлюч, ТЗначение>>:
    //Set<Entry<Ключ, Значение>> имя = map.entrySet();
    //Тут мы видим сложный тип Set с параметром-значением,
    //а в качестве параметра-значение выступает еще один сложный тип (Entry), так еще и с двумя параметрами.

    //  HashMap<String, Integer> map = new HashMap<String, Integer>();
    //  map.put("Серега", 21);
    //  map.put("Николай", 22);
    //  map.put("Иван Петрович", 48);
    //  map.put("Анюта", null);

    //  Set<Map.Entry<String, Integer>> entries = map.entrySet();

    //  for(Map.Entry<String, Integer> pair: entries)
    //  {
    //      String key = pair.getKey();
    //      Integer value = pair.getValue();
    //      System.out.println(key + " --> " + value);
    //  }

    //Хотя этот код можно и немножко упростить:
    //Во-первых, можно не создавать отдельную переменную для entries, а сразу вызвать метод entrySet() внутри цикла for:
    //  for(Map.Entry<String, Integer> pair: map.entrySet())
    //  {
    //      String key = pair.getKey();
    //      Integer value = pair.getValue();
    //      System.out.println(key + " --> " + value);
    //  }

    //Во-вторых, можно воспользоваться недавно появившимся оператором var для автоматического выведения типа пары элементов:
    //  for(var pair: map.entrySet())
    //  {
    //      String key = pair.getKey();
    //      Integer value = pair.getValue();
    //      System.out.println(key + " --> " + value);
    //  }

    //В классе lesson_14_21 объявлено поле grades типа HashMap<String, Double>, где ключ — имя и фамилия студента,
    //а значение - его средняя оценка. Попробуем сделать один метод,
    //который будет выводить полную информацию о студентах, используя метод entrySet класса HashMap.
    //Вывод должен быть следующий: [полное имя] : [средняя оценка]
    //Для студента Андрей Петров со средним баллом 4.5, вывод будет следующим:
    //Андрей Петров : 4.5

    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        printStudentsInfo();
    }

    public static void addStudents() {
        grades.put("Влад", 5.0);
        grades.put("Женя", 3.0);
        grades.put("Маша", 4.0);
        grades.put("Вика", 5.0);
        grades.put("Игорь", 2.0);
    }

    public static void printStudentsInfo() {
        for(var pair:grades.entrySet())
        {
            String name = pair.getKey();
            Double score = pair.getValue();
            System.out.println(name + " : " + score);
        }
    }
}
