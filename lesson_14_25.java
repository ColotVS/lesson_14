public class lesson_14_25 {
    //Устройство LinkedList

    //LinkedList имеет альтернативное внутреннее устройство, если сравнивать его с ArrayList.
    //Массива для хранения элементов у него внутри нет. Вместо этого он использует структуру данных под названием двусвязный список.
    //Каждый элемент двусвязного списка хранит ссылки на предыдущий и следующий элемент.
    //Это чем-то напоминает очередь, где каждый человек запоминает того, кто стоит перед ним, и того, кто стоит после него.

    //Пришло время познакомиться с двусвязным списком.
    //Решая эту задачу ты поймешь, как работает двусвязный список и сможешь добавлять в него элементы.
    //У тебя есть класс StringLinkedList, в котором есть поля first и last, указывающие на первый и последний элемент соответственно.
    //Тебе нужно реализовать логику метода add, который будет добавлять элементы в список.
    public static void main(String[] args) {
        StringLinkedList stringLinkedList = new StringLinkedList();
        stringLinkedList.add("1");
        stringLinkedList.add("2");
        stringLinkedList.add("3");
        stringLinkedList.add("4");
        stringLinkedList.add("5");
        stringLinkedList.add("6");
        stringLinkedList.add("7");
        stringLinkedList.add("8");
        stringLinkedList.add("9");
        stringLinkedList.printAll();
    }
}

class StringLinkedList{
    private Node first = new Node();
    private Node last = new Node();

    public StringLinkedList() {
        first.next = last;
        last.prev = first;
    }

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node node = new Node();
        node.value = value;

        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
