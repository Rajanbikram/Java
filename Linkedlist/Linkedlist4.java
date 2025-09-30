package Linkedlist;

public class Linkedlist4 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Find {
        Node head = null;

        void findAt(Node head, int x) {
            Node slow = head;
            Node fast = head;
            for (int i = 1; i <= x; i++) {

                fast = fast.next;
            }

            while (fast.next != null) {
                slow = slow.next;

                fast = fast.next;
            }
            slow.next = slow.next.next;

        }

        void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
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

        Find list = new Find();
        list.head = a;

        System.out.println("Original elemenents");
        list.printList();

        list.findAt(a, 3);

        System.out.println("Remaining elements");
        list.printList();
    }

}