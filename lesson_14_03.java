import java.util.Arrays;
import java.util.HashSet;

public class lesson_14_03 {
    //В классе lesson_14_03 есть метод arrayToHashSet(String[]),
    //который должен из переданного массива вернуть HashSet<String> с теми же элементами.
    //Метод main не участвует в проверке.
    public static void main(String[] args) {
        String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};
        for (String string : array) {
            System.out.println(string);
        }
        System.out.println("___________________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for(String s : hashSet) {
            System.out.println(s);
        }
    }

    public static HashSet<String> arrayToHashSet(String[] strings) {
        return new HashSet<>(Arrays.asList(strings));
    }
}
