import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class lesson_14_13 {
    //В классе lesson_14_13 объявлены методы:
    //copy(ArrayList<String>,
    //ArrayList<String>),
    //addAll(ArrayList<String>, String...),
    //replaceAll(ArrayList<String>, String, String).
    //Тебе нужно переписать их реализацию, используя при этом только соответствующие методы класса Collections.
    //Параметр String... означает то же, что и String[], только аргументы String можно передавать через запятую.
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list2.add("10");
        list2.add("20");
        list2.add("30");

        System.out.println("Выводим первоначальные данные:");
        for(String str:list) {System.out.print(str+" ");}
        System.out.println();
        for(String str:list2) {System.out.print(str+" ");}
        System.out.println();
        System.out.println("___________________");

        addAll(list,"4","5");
        addAll(list2,"40","50");

        System.out.println("Делаем addAll:");
        for(String str:list) {System.out.print(str+" ");}
        System.out.println();
        for(String str:list2) {System.out.print(str+" ");}
        System.out.println();
        System.out.println("___________________");

        replaceAll(list,"1","6");
        replaceAll(list2,"10","60");

        System.out.println("Делаем replaceAll:");
        for(String str:list) {System.out.print(str+" ");}
        System.out.println();
        for(String str:list2) {System.out.print(str+" ");}
        System.out.println();
        System.out.println("___________________");

        copy(list,list2);

        System.out.println("Делаем copy:");
        for(String str:list) {System.out.print(str+" ");}
        System.out.println();
        for(String str:list2) {System.out.print(str+" ");}
        System.out.println();
        System.out.println("___________________");

    }
    public static void copy(ArrayList<String> destination, ArrayList<String> source) {
        Collections.copy(destination,source);
    }

    public static void addAll(ArrayList<String> list, String... strings) {
        Collections.addAll(list,strings);
    }

    public static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {
        Collections.replaceAll(list,oldValue,newValue);
    }
}
