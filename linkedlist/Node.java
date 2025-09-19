package linkedlist;

public class Node {
    private int data;
    private Node next;

    public Node(int data){
        this.data =data;

    }
    public int getData(){
        return data;
    }
    public void setData(int data){
        this.data=data;
    }
    public Node getNext(){
        return next;
    }
    public void setNext(Node next){
        this.next=next;
    }
    
}
class Main{
    public static void main(String[] args) {
        Node ten=new Node(10);
        Node twenty=new Node(20);
        Node thirty=new Node(30);
        Node forty=new Node(40);
        Node fifty=new Node(50);

        Node head=ten;
        ten.setNext(twenty);
        twenty.setNext(thirty);
        thirty.setNext(forty);
        forty.setNext(fifty);
        fifty.setNext(null);

        head=insertAtFront(head,5);
        printLinkedList(head);

        head=deleteAtFront(head);
        printLinkedList(head);
    }
    public static Node insertAtFront(Node head,int data){
        Node nn=new Node(data);
        nn.setNext(null);

        if(head==null){
            head=nn;
        }
        else{
            nn.setNext(head);
            head=nn;
        }
        return head;

    }
    public static  Node deleteAtFront(Node head){
        if(head != null){
            head = head.getNext();
            return head;
        } else {
            return null;
        }
    }

    public static void printLinkedList(Node head) {
        System.out.println("Printing the Linked List !");
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}
