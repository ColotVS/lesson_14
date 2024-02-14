import java.util.ArrayList;
import java.util.Collections;

public class lesson_14_15 {
    //В классе lesson_14_15 объявлены методы:
    //reverse(ArrayList<Integer>),
    //sort(ArrayList<Integer>),
    //rotate(ArrayList<Integer>, int),
    //shuffle(ArrayList<Integer>).
    //Тебе нужно разобраться, что делают методы, переписать их реализацию, используя при этом только соответствующие методы класса Collections.
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        for (int i = 10; i > 0; i--) {
            list2.add(i);
        }

        System.out.println("Выводим первоначальные данные:");
        for(int x:list) {System.out.print(x+" ");}
        System.out.println();
        for(int x:list2) {System.out.print(x+" ");}
        System.out.println();
        System.out.println("___________________");

        reverse(list);
        reverse(list2);

        System.out.println("Делаем reverse:");
        for(int x:list) {System.out.print(x+" ");}
        System.out.println();
        for(int x:list2) {System.out.print(x+" ");}
        System.out.println();
        System.out.println("___________________");

        shuffle(list);
        shuffle(list2);

        System.out.println("Делаем shuffle:");
        for(int x:list) {System.out.print(x+" ");}
        System.out.println();
        for(int x:list2) {System.out.print(x+" ");}
        System.out.println();
        System.out.println("___________________");

        sort(list);
        sort(list2);

        System.out.println("Делаем sort:");
        for(int x:list) {System.out.print(x+" ");}
        System.out.println();
        for(int x:list2) {System.out.print(x+" ");}
        System.out.println();
        System.out.println("___________________");

        rotate(list,5);
        rotate(list2,5);

        System.out.println("Делаем rotate:");
        for(int x:list) {System.out.print(x+" ");}
        System.out.println();
        for(int x:list2) {System.out.print(x+" ");}
        System.out.println();
        System.out.println("___________________");

    }
    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
        }


    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }

    public static void rotate(ArrayList<Integer> list, int distance) {
        Collections.rotate(list,distance);
    }

    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }
}
