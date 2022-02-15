
public class LinkedListSingly {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(2);
        linkedList.insert(4);
        // linkedList.insertAt(1,12);
        // linkedList.insert(23);

        linkedList.show();
    }
}

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

class LinkedList {
    Node head;

    void insert(int data) {
        Node toAdd = new Node(data);
        toAdd.data = data;
        toAdd.next = null;

        if (head == null) {
            head = toAdd;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = toAdd;
        }
    }

    void insertAt(int position, int data) {
        Node toAdd = new Node(data);

        Node prev = head;
        for (int i =0; i<position-1;i++){
            prev = prev.next;
        }
        toAdd.next = prev.next;
        prev.next = toAdd;
    }

    void insertAtStart(int data) {
        Node toAdd = new Node(data);

        toAdd.next = head;
        head = toAdd;
        return;
    }

    void delete(int position,Node head) {
        Node prev = head;
        for (int i =0; i<position-1;i++){
            prev =prev.next;
        }
        prev.next = prev.next.next;
    }

    void deleteStart(Node head) {
        head = head.next;
        return;
    }

    void show() {
        Node n = head;
        while (n.next != null) {
            System.out.println(n.data);
            n= n.next;
        }
        System.out.println(n.data);
    }

    void traverse(Node head){
        Node curr = head;
        while (curr!=null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}