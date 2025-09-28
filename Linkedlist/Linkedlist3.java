package Linkedlist;

public class Linkedlist3 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Delet {
        Node head = null;
        Node tail = null;

        void deletedAt(int idx) {
            if (head == null) {
                return;
            }
            if (idx == 0) {
                head = head.next;
                return;
            }

            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

        void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);
        Node f = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        Delet list = new Delet();
        list.head = a;
        list.tail = f;

        System.out.println("Original List:");
        list.printList();

        list.deletedAt(0);
        list.deletedAt(3);
        list.deletedAt(3);

        System.out.println("After Deletions:");
        list.printList();
    }
}

// deleting elements