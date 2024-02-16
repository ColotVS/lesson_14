import java.util.ArrayList;
import java.util.Collections;

public class lesson_14_32 {
    //Добавление своих методов в enum

    //Так как enum во время компиляции превращается в обычный класс, в нем можно объявлять методы:
    //эти методы просто добавятся в класс, который сгенерирует компилятор.
    //Например, мы хотим, чтобы наш enum Day возвращал не массив значений, а список.
    //Тогда в него можно дописать такой код:
    //enum Day
    //{
    //   MONDAY,
    //   TUESDAY,
    //   WEDNESDAY,
    //   THURSDAY,
    //   FRIDAY,
    //   SATURDAY,
    //   SUNDAY;                                            После списка значений нужно поставить точку с запятой.
    //
    //   public static List<Day> asList()
    //   {
    //      ArrayList<Day> list = new ArrayList<Day>();     Создаем объект ArrayList.
    //
    //      Collections.addAll(list, values());             Добавляем в него значения из массива: его возвращает метод values().
    //
    //      return list;                                    Возвращаем список.
    //   }
    //
    //}

    //Теперь этот метод можно вызывать в коде:
    //List<Day> list = Day.asList();                        В переменную list будет сохранен список всех значений enum’а Day.
    //В enum Month2 добавь 4 метода:
    //getWinterMonths(), getSpringMonths(), getSummerMonths(), getAutumnMonths() которые будут возвращать массив с тремя месяцами.
    public static void main(String[] args) {
        ArrayList <Month2> winter = Month2.getWinterMonths();
        for(Month2 mount:winter){
            System.out.println(mount);
        }
        ArrayList<Month2> spring = Month2.getSpringMonths();
        for(Month2 mount:spring){
            System.out.println(mount);
        }
        ArrayList<Month2> summer = Month2.getSummerMonths();
        for(Month2 mount:summer){
            System.out.println(mount);
        }
        ArrayList<Month2> autumn = Month2.getAutumnMonths();
        for(Month2 mount:autumn){
            System.out.println(mount);
        }
    }
}

enum Month2{
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
    DECEMBER;

    public static ArrayList<Month2> getWinterMonths(){
        ArrayList <Month2> winterArrayList = new ArrayList<>();
        Collections.addAll(winterArrayList,Month2.DECEMBER,Month2.JANUARY,Month2.FEBRUARY);
        return winterArrayList;
    }
    public static ArrayList<Month2> getSpringMonths(){
        int indexFirstSpringMonths = Month2.MARCH.ordinal();
        ArrayList <Month2> springArrayList = new ArrayList<>();
        Collections.addAll(springArrayList,Month2.values()[indexFirstSpringMonths],Month2.values()[indexFirstSpringMonths+1],Month2.values()[indexFirstSpringMonths+2]);
        return springArrayList;

    }
    public static ArrayList<Month2> getSummerMonths(){
        ArrayList <Month2> summerArrayList = new ArrayList<>();
        Collections.addAll(summerArrayList,Month2.JUNE,Month2.JULY,Month2.AUGUST);
        return summerArrayList;

    }
    public static ArrayList<Month2> getAutumnMonths(){
        ArrayList <Month2> autumnArrayList = new ArrayList<>();
        Collections.addAll(autumnArrayList,Month2.SEPTEMBER,Month2.OCTOBER,Month2.NOVEMBER);
        return autumnArrayList;

    }
}

