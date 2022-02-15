
class Node {
    int data;
    Node next;

    public Node() {
        data = 0;
        next = null;
    }

    public Node(int d, Node n) {
        data = d;
        next = n;
    }

    void setData(int d) {
        data = d;
    }

    void setNext(Node n) {
        next = n;
    }

    int getData() {
        return data;
    }

    Node getNext() {
        return next;
    }

}

class LinkedList {
    int size;
    Node start;

    boolean isEmpty() {
        if (start == null) {
            return true;
        }
        return false;
    }

    void insertFirst(int val) {
        Node n = new Node();
        n.setData(val);
        n.setNext(start);
        size++;
    }

    void insertLast(int val) {
        Node n, t;
        n = new Node();
        n.setData(val);
        t = start;
        if (t == null) {
            start = n;
        } else {
            while (t.getNext() != null) {
                t = t.getNext();
                t.setNext(n);
            }
        }
        size++;
    }

    int getListSize() {
        return size;
    }

    void viewList() {
        Node t;
        if (isEmpty()) {
            System.out.println("Empty");
        } else {
            t = start;
            for (int i = 0; i < size; i++) {
                System.out.print(t.getData() + " ");
                t = t.getNext();
            }
        }
    }
}

public class DoublyList {
    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.insertLast(12);
        link.viewList();
    }
}