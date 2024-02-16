import java.util.HashMap;

public class lesson_14_20 {
    //Подмножества HashMap: множество ключей

    //Допустим мы хотим просто вывести все элементы HashMap на экран, как нам это сделать?

    //Самый простой способ – использовать цикл по ключам
    //У элементов класса HashMap нет порядкового номера, поэтому цикл со счетчиком тут не подойдет.
    //Зато мы можем получить множество ключей с помощью метода keySet():

    //  HashMap<String, Integer> map = new HashMap<String, Integer>();
    //  map.put("Серега", 21);
    //  map.put("Николай", 22);
    //  map.put("Иван Петрович", 48);
    //  map.put("Анюта", null);
    //  for (String key: map.keySet())                      //Цикл по всем ключам map
    //  {
    //      Integer value = map.get(key);                   //Получаем значение по ключу
    //      System.out.println(key + " --> " + value);
    //  }

    //В классе lesson_14_20 объявлено поле grades типа HashMap<String, Double>, где ключ — имя и фамилия студента,
    //а значение - его средняя оценка. На этот раз твоя задача — реализовать методы:
    //printStudents, который выводит только имена всех студентов (ключ коллекции);
    //getAverageMark, который возвращает средний балл всех студентов.

    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println("Список студентов группы: ");
        printStudents();
        System.out.print("Средний балл группы: " + getAverageMark());
    }

    public static void addStudents() {
        grades.put("Влад", 5.0);
        grades.put("Женя", 3.0);
        grades.put("Маша", 4.0);
        grades.put("Вика", 5.0);
        grades.put("Игорь", 5.0);
    }

    public static void printStudents() {
        for(String name: grades.keySet()){
            System.out.println(name);
        }

    }

    public static Double getAverageMark() {
        Double avg = 0.0;
        for (Double value: grades.values()){
            avg += value;
        }
        return avg / grades.size();
    }
}
