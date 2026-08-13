// blueprint for a node
class Node{
    int data;
    Node next;

    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }}

public class LinkedListDemo {
    public static void main(String[] args) {

        Node head=new Node(10);
        Node secound=new Node(20);
        Node third=new Node(30);

        head.next=secound;
        secound.next=third;

        System.out.println("Linked List: ");
        Node current = head;

        while (current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("Null");
    }
}
