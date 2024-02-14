import java.util.ArrayList;
import java.util.Collections;

public class lesson_14_17 {
    //В классе lesson_14_17 объявлены методы:
    //min(ArrayList<Integer>),
    //max(ArrayList<Integer>),
    //frequency(ArrayList<Integer>, Integer),
    //binarySearch(ArrayList<Integer>, Integer).
    //Тебе нужно разобраться, что делают методы, переписать их реализацию, используя при этом только соответствующие методы класса Collections.
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        for (int i = 10; i <= 100; i=i+10) {
            list2.add(i);
        }

        System.out.println("Выводим первоначальные данные:");
        for(int x:list) {System.out.print(x+" ");}
        System.out.println();
        for(int x:list2) {System.out.print(x+" ");}
        System.out.println();
        System.out.println("___________________");

        int min1 = min(list);
        int min2 = min(list2);

        System.out.println("Минимальный элемент списка list: " + min1);
        System.out.println("Минимальный элемент списка list2: " + min2);
        System.out.println("___________________");

        int max1 = max(list);
        int max2 = max(list2);

        System.out.println("Максимальный элемент списка list: " + max1);
        System.out.println("Максимальный элемент списка list2: " + max2);
        System.out.println("___________________");

        int freq1 = frequency(list,2);
        int freq2 = frequency(list2,2);

        System.out.println("Значение 2 встречается в списке list: " + freq1 + " раз");
        System.out.println("Значение 2 встречается в списке list2: " + freq2 + " раз");
        System.out.println("___________________");

        int index1 = binarySearch(list,4);
        int index2 = binarySearch(list2, 60);

        System.out.println("Значение 4 в списке list находится под индексом: " +index1);
        System.out.println("Значение 60 в списке list2 находится под индексом: " +index2);
        System.out.println("___________________");
    }
    public static Integer min(ArrayList<Integer> list) {
        return Collections.min(list);
    }

    public static Integer max(ArrayList<Integer> list) {
        return Collections.max(list);
    }

    public static int frequency(ArrayList<Integer> list, Integer element) {
        return Collections.frequency(list,element);
    }

    public static int binarySearch(ArrayList<Integer> list, Integer key) {
        Collections.sort(list);
        return Collections.binarySearch(list,key);
    }
}
