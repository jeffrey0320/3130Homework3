import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {
        DList list = new DList();
        list.addLast("Bird");
        list.addFirst("Hello");
        list.addFirst("World");
        list.addFirst("Bye");
        list.addLast("yes");

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}
