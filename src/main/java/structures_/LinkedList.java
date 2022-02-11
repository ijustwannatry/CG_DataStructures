package structures_;

public class LinkedList {

    Node first;
    Node last;
    int size;

    private void linkLast(Integer i) {
        Node l = last;
        Node newNode = new Node(last, i, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }

    public void add(Integer i) {
        linkLast(i);
    }

    public void printList() {
        Node n = first;
        System.out.print("null -> ");
        while (n != null) {
            System.out.print(n.data + " -> ");
            n = n.getNext();
        }
        System.out.println("null");
    }

    public void reverseList() {
        first = last;
        Node prev = null;
        Node current = last;
        while (current != null) {
            swap(current);
            prev = current;
            current = current.next;
        }
        last = prev;
    }

    public void swap(Node node) {
        Node temp = node.next;
        node.setNext(node.prev);
        node.setPrev(temp);
    }

}

class Node {

    Integer data;
    Node next;
    Node prev;

    public Node(Node prev, Integer data, Node next) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}