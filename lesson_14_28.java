public class lesson_14_28 {
    //Нужно создать набор значений (enum) для времен года.
    //Для этого нужно создать enum Season и объявить в нем 4 значения.
    //В методе lesson_14_28 выведи все перечисления с новой строки.
    public static void main(String[] args) {
        System.out.println(Season.WINTER);
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
    }
}
enum Season{
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN;
}