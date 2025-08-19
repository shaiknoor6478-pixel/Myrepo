class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }

    public void delete(int key) {
        Node temp = head, prev = null;

        if (temp != null && temp.data == key) {
            head = temp.next;
            System.out.println(key + " deleted from the list.");
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Node with data " + key + " not found.");
            return;
        }

        prev.next = temp.next;
        System.out.println(key + " deleted from the list.");
    }

    public void printList() {
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        System.out.println("--- Insertion ---");
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.printList();

        System.out.println("\n--- Deletion ---");
        list.delete(30);
        list.printList();

        list.delete(10);
        list.printList();

        list.delete(50);
        list.printList();

        list.delete(40);
        list.printList();
    }
}