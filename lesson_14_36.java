public class lesson_14_36 {
    //Что можно использовать в качестве параметра у switch

    //Не все типы можно использовать в качестве значений для case внутри оператора switch.
    //Сейчас там можно использовать литералы таких типов:
    //целые типы: byte, short, int
    //тип char
    //тип String
    //значения любого enum-типа

    //Никаких других типов писать в качестве значений внутри case нельзя.
    //Пример использования enum внутри switch:
    public static void main(String[] args) {
        Day day = Day.MONDAY;
        switch (day) {
            case MONDAY -> System.out.println("Понедельник");
            case TUESDAY -> System.out.println("Вторник");
            case WEDNESDAY -> System.out.println("Среда");
            case THURSDAY -> System.out.println("Четверг");
            case FRIDAY -> System.out.println("Пятница");
            case SATURDAY -> System.out.println("Суббота");
            case SUNDAY -> System.out.println("Воскресенье");
        }
    }
}
