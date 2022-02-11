import java.util.HashMap;
import structures.HashTable;
import structures_.Queue;
import structures_.Stack;
import structures_.LinkedList;

public class Main {

    public static void main(String[] args) {
//        Stack stack = new Stack();
//
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//
//        Queue queue = new Queue();
//
//        queue.offer(1);
//        queue.offer(2);
//        queue.offer(3);
//        System.out.println(queue.poll());
//
//        queue.offer(4);
//        queue.offer(5);
//
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//
//        LinkedList llr = new LinkedList();
//        llr.add(5);
//        llr.add(10);
//        llr.add(11);
//        llr.add(13);
//
//
//        llr.printList();
//
//        llr.reverseList();
//
//        llr.printList();

        HashTable hashTable = new HashTable();

        hashTable.put("dog", 10);
        hashTable.put("cat", 12);

        System.out.println(hashTable.get("dog"));
        System.out.println(hashTable.get("cat"));
        System.out.println(hashTable.get("cat"));
        System.out.println(hashTable);

        hashTable.put("cat", 22);
        System.out.println(hashTable.get("cat"));
        System.out.println(hashTable);

    }
}
