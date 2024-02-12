import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class lesson_14_07 {
    //В классе lesson_14_07 есть метод print(HashSet<String>), который должен выводить в консоли все элементы множества, используя iterator().
    //Метод main не участвует в проверке.
    public static void print(HashSet<String> words) {
        Iterator<String> it = words.iterator();
        while(it.hasNext())
        {
            String str = it.next();
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Программированию обычно учат на примерах.".split(" ")));
        print(words);
    }
}
