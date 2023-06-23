// Задание № 2 |================================================

/*Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.*/

//===============================================================

package LListMethods;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LListQueue {

    private static LinkedList<String> list = new LinkedList<>();

    public static void Task2() {
        List<String> collection = Arrays.asList("AAAA", "BBBB", "CCCC", "DDDD", "EEEE");
        list.addAll(collection);
        System.out.println("Original llist\n" + list + '\n');

        System.out.println(("Result of method 'enqueue()'\n" + enqueue(list, "FFFF") + "\n"));
        System.out.println("Result of method 'dequeue()'\n" + dequeue(list));
        System.out.println("Modified LList\n" + list + "\n");
        System.out.println("Result of method 'first()'\n" + first(list));
    }

    private static LinkedList<String> enqueue(LinkedList list, String str) {
        list.addLast(str);
        return list;
    }

    private static String dequeue(LinkedList list) {
        return list.removeFirst().toString();
    }

    private static String first(LinkedList list) {
        return list.getFirst().toString();
    }
}
