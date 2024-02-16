import java.util.HashMap;

public class lesson_14_19 {
    //Методы класса HashMap.

    //Добавление элементов в HashMap

    //Элементы добавляются в карту сразу парами: для этого используется метод put(). Первым в него передается ключ, вторым — значение.
    //  HashMap<String, Integer> map = new HashMap<String, Integer>();
    //  map.put("Серега", 21);
    //  map.put("Николай", 22);
    //  map.put("Иван Петрович", 48);
    //  map.put("Анюта", null);

    //Если при добавлении элемента выяснится, что элемент с таким ключом уже есть, старое значение ключа заменится на новое.
    //Такое поведение делает HashMap похожим на массив или список, если бы у них в качестве индексов выступали слова (String), а не числа.

    //В классе lesson_14_19 объявлено поле grades типа HashMap<String, Double>,
    //где ключ — имя и фамилия студента, а значение - его средняя оценка.
    //Твоя задача — реализовать метод addStudents, который добавит 5 студентов с их средней оценкой в коллекцию grades.
    //Значения можешь выбрать любые.

    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Влад", 5.0);
        grades.put("Женя", 3.0);
        grades.put("Маша", 4.0);
        grades.put("Вика", 5.0);
        grades.put("Игорь", 2.0);
    }
}
