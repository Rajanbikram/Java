package Linkedlist;

public class Linkedlist7 {
  public static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  public static class Find {
    Node head = null;

    Node findAt(Node head) {
      Node slow = head;
      Node fast = head;

      while (fast.next.next != null && fast.next.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
      }
      if(slow.next ==null) return null;
      slow.next = slow.next.next;
      return head;

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

    Find list = new Find();
    list.head = a1;

    System.out.println("original Elements");
    list.printList( list.head);

    
      list.head = list.findAt(list.head);
    System.out.println("Remaining element");
    list.printList(list.head);
  }
}
