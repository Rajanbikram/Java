package Linkedlist;

public class Linkedlist5 {
  public static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  public static class Find {
    Node head = null;

    Node findAt(Node head1, Node head2) {
      Node temp1 = head1;
      Node temp2 = head2;

      int length1 = 0;
      temp1 = head1;
      while (temp1 != null) {
        length1++;
        temp1 = temp1.next;
      }
      int length2 = 0;
      temp2 = head2;
      while (temp2 != null) {
        length2++;
        temp2 = temp2.next;

      }
      temp1 = head1;
      temp2 = head2;

      if (length1 > length2) {
        int size = length1 - length2;
        for (int i = 0; i < size; i++) {
          temp1 = temp1.next;
        }
      } else {
        int size = length2 - length1;
        for (int i = 0; i < size; i++) {
          temp2 = temp2.next;
        }
      }

      while (temp1 != null && temp2 != null) {
        if (temp1 == temp2) {
          return temp1;
        }
        temp1 = temp1.next;
        temp2 = temp2.next;
      }
      return null;
    }

    void printList(Node head) {
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
      System.out.println();
    }

  }

  public static void main(String[] args) {
    Node a1 = new Node(5);
    Node a2 = new Node(6);
    Node a3 = new Node(7);
    Node a4 = new Node(8);
    Node a5 = new Node(9);

    a1.next = a2;
    a2.next = a3;
    a3.next = a4;
    a4.next = a5;

    Node b1 = new Node(1);
    Node b2 = new Node(2);
    Node b3 = new Node(3);
    Node b4 = new Node(4);

    b1.next = b2;
    b2.next = b3;
    b3.next = b4;

    b4.next = a3;

    Find list = new Find();

    System.out.println("first Elements");
    list.printList(a1);

    System.out.println("Second Elements");
    list.printList(b1);

    Node intersect = list.findAt(a1, b1);
    if (intersect != null) {
      System.out.println("intersect " + intersect.data);
    }else
    System.out.println("Not Intersected");
  }
}

// intersection  of  two points