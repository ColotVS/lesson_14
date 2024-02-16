public class lesson_14_29 {
    //Методы enum’а

    //Тип enum имеет несколько встроенных методов, два из них очень интересные:

    //Статический метод values() возвращает массив всех значений типа enum:

    //  Day[] days = Day.values();
    //  for (Day day: days)
    //      System.out.println(day);

    //Метод ordinal() возвращает порядковый номер константы. Вызывать его нужно не у класса enum, а у значения enum:

    //System.out.println(Day.MONDAY.ordinal());  //0
    //System.out.println(Day.FRIDAY.ordinal());  //4
    //System.out.println(Day.SUNDAY.ordinal());  //6

    //В enum JavarushQuest хранится список квестов.
    //Твоя задача — получить массив всех элементов в методе main (используй метод values())
    //и вывести порядковый номер каждого из них (используй метод ordinal()) с новой строки.
    public static void main(String[] args) {
        JavarushQuest[] quest = JavarushQuest.values();
        for (JavarushQuest quests:quest)
        {
            System.out.println(quests.ordinal());
        }
    }

}
enum JavarushQuest {
    JAVA_SYNTAX,
    JAVA_CORE,
    JAVA_MULTITHREADING,
    JAVA_COLLECTIONS,
    CS_50,
    ANDROID,
    GAMES
}