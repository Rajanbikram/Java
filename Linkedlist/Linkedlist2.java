package Linkedlist;

public class Linkedlist2 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Insert {
        Node head = null;
        Node tail = null;

        void insertAt(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;

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

        Insert list = new Insert();
        list.head = a;
        list.tail = f;

        System.out.println("original List");
        list.printList();

        list.insertAt(2, 14);

        System.out.println("final list");
        list.printList();
    }
}

// insert Number