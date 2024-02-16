public class lesson_14_27 {
    //Новый тип данных – enum: перечисление
    //Сегодня мы изучим еще одну разновидность типов данных в Java — enum.
    //Название enum происходит от слова Enumeration — перечисление. Что же это за тип данных и с чем его едят?
    //Иногда в работе программиста возникает необходимость создать новый тип данных,
    //переменные которого принимают только значения из небольшого фиксированного списка.
    //Например, тип ДеньНедели может принимать только значения ПОНЕДЕЛЬНИК, ВТОРНИК, СРЕДА, ... Всего 7 значений.
    //Или тип Месяц может принимать только значения ЯНВАРЬ, ФЕВРАЛЬ, МАРТ, ... Всего 12 значений.
    //Можно, конечно, использовать числа (тип int): 1 — понедельник, 2 — вторник и т.д.
    //Но кто-то случайно может присвоить такой переменной значение 8, или, например, значение 0.
    //Легко может возникнуть ситуация, когда один программист думает,
    //что дни недели (или месяцы) нумеруются с нуля, другой — что с единицы и т.д.
    //Поэтому в Java придумали тип данных, который состоит из конечного набора значений — enum.

    //Выглядит объявление нового enum типа данных так:
    //
    //enum ИмяТипа
    //{
    //   ЗНАЧЕНИЕ1,
    //   ЗНАЧЕНИЕ2,
    //   ЗНАЧЕНИЕ3
    //}
    //Где ИмяТипа — это имя нового типа (класса), а в скобках через запятую перечислены возможные значения: Значение1, Значение2, Значение3.
    //
    public static void main(String[] args) {
        Day day = Day.FRIDAY;
        System.out.println(day);
    }

    //Давайте ради примера создадим свой enum для типа ДеньНедели:
}
enum Day            //Новый тип Day
{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
//Присваивать значения переменным этого типа можно таким образом:
//Day day = Day.MONDAY;