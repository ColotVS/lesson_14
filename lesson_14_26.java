public class lesson_14_26 {
    //Решая эту задачу, ты научишься извлекать элемент из двусвязного списка.
    //Мы реализовали метод add, который добавляет элементы в конец списка.
    //Тебе нужно реализовать метод get(int), который вернет строку под индексом, переданным в метод.
    //Если строки с таким индексом нет, нужно вернуть null.
    //Помни, что first и last не имеют значений, а ссылаются только на первый и последний элемент соответственно.

    public static void main(String[] args) {
        StringLinkedList2 stringLinkedList = new StringLinkedList2();
        stringLinkedList.add("1");
        stringLinkedList.add("2");
        stringLinkedList.add("3");
        stringLinkedList.add("4");
        stringLinkedList.add("5");
        stringLinkedList.add("6");
        stringLinkedList.add("7");
        stringLinkedList.add("8");
        stringLinkedList.add("9");
        System.out.println(stringLinkedList.get(4)); // 5
    }
}

class StringLinkedList2 extends StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public StringLinkedList2() {
        first.next = last;
        last.prev = first;
    }
    public String get(int index) {
        int currentIndex = 0;
        Node currentElement = first.next;
        while ((currentElement) != null) {
            if (currentIndex == index) {
                return currentElement.value;
            }
            currentElement = currentElement.next;
            currentIndex++;
        }
        return null;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
