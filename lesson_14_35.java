public class lesson_14_35 {
    //Действие по умолчанию: default

    //А что будет происходить, если ни одно из предложенных значений внутри switch не совпало со значением выражения внутри круглых скобок?
    //Если подходящий вариант не найдется, работа оператора switch завершится,
    //и программа продолжит выполнять тот код, который написан после фигурных скобок оператора switch.
    //Однако в switch есть возможность сделать поведение, аналогичное ветке else из if-else.
    //Для этого нужно использовать ключевое слово default.
    //Если ни один case вариант внутри switch не совпал со значением выражения и в switch объявлен default, будет выполнен его код. Пример:

    public static void main(String[] args) {
        int temperature = 40;
        switch(temperature)
        {
            case 36:
                System.out.println("Низкая");
                break;
            case 37:
                System.out.println("Нормальная");
                break;
            case 38:
                System.out.println("Высокая");
                break;
            default:
                System.out.println("Нужна скорая");
        }
    }
}
