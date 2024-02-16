public class lesson_14_31 {
    //Еще методы enum’а

    //Еще у всех enum-классов есть несколько интересных особенностей.

    //Преобразование в строку и обратно
    //Чтобы преобразовать объект типа enum в строку, у него нужно вызвать метод toString().
    //String str = Day.MONDAY.toString();

    //Для обратного преобразования (строки в объект Day) можно воспользоваться статическим методом valueOf():
    //Day day = Day.valueOf("MONDAY");

    //Преобразование в число и обратно
    //Как преобразовать объект типа enum в число, вы уже знаете: для этого нужно вызвать метод ordinal():
    //int index = Day.MONDAY.ordinal();

    //Для обратного преобразования (числа в объект Day) нужно воспользоваться конструкцией подлиннее:
    //Day day = Day.values()[2];

    //Day day = Day.MONDAY;                 //Понедельник
    //int index = day.ordinal();            //Получаем индекс понедельника (0)
    //Day newDay = Day.values()[index+2];   //День недели на 2 дня позже понедельника

    //Важный момент, т.к. значения типа enum представляют собой фиксированный набор констант, их можно сравнивать через ==.
    //Ну не может существовать двух одинаковых объектов MONDAY с разными ссылками.
    //Каждый объект-значение типа enum существует только в единственном экземпляре.
    //Поэтому сравнение переменных типа enum через == всегда будет работать.

    //В классе lesson_14_31 реализуй метод getNextMonth, который должен возвращать следующий месяц,
    //а если передан последний месяц, возвращать первый. Используй методы values и ordinal.
    //Метод main не участвует в проверке.
    public static void main(String[] args) {
        System.out.println(getNextMonth(Months.DECEMBER));
        System.out.println(getNextMonth(Months.JULY));
    }

    public static Months getNextMonth(Months month) {
        if(month.ordinal() == 11)
            return Months.JANUARY;
        else return Months.values()[month.ordinal()+1];
    }
}
enum Months{
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}

