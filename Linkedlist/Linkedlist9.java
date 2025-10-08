package Linkedlist;

public class Linkedlist9 {
  public static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }
    public static class Reverse {
      Node head = null;

      Node reversNode(Node head) {
        Node curr = head;
        Node after = null;
        Node prev = null;

        while (curr != null) {
          after = curr.next;
          curr.next = prev;
          prev = curr;
          curr = after;

        }
        return prev;
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

      Reverse list = new Reverse();

      Node rNode = list.reversNode(a1);
      System.out.println("Reversed List");
      list.printList(rNode);
    }

  
}