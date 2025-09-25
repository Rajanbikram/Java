package Linkedlist;
  public class Linkedlist{
    public static class Node{
        int data;
        Node next;

        Node(int dat){
            this.data = data;
            
        }
    }

    public static int length(Node head){
        int count = 0;
        while(head!=null){
            count ++;
            head = head.next;
        }
         return count;
    }
     public static void main(String[] args) {
       Node a = new Node(5);
       Node b = new Node(4);
       Node c = new Node(3);
       Node d = new Node(2);
       Node e = new Node(1);
       Node f = new Node(7);

       a.next = b;
       b.next = c;
       c.next = d;
       d.next = e;
       e.next = f;

      System.out.println(length(a));
     }
  }


