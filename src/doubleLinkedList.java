public class doubleLinkedList {
    private Node head;
    private Node tail;
    private int size;

    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev=null;
        }
    }
    public void insertFirst(int data) {
        Node newnode=new Node(data);
        if (head == null) {
            head = tail = newnode;
        }
        else{
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
            newnode.prev=null;
        }
        size++;
    }
    public void insertLast(int data){
        Node newnode=new Node(data);
        if (head == null) {
            head = tail = newnode;
        }
        else {
            newnode.prev = tail;
            tail.next = newnode;
            newnode.next = null;
            tail = newnode;
        }
        size++;
    }
    public void insertAtPosition(int data,int index){
        Node newnode=new Node(data);
        if(index==1){
            insertFirst(data);
        }
        else if (index==size) {
            insertLast(data);
        }
        else if (index<0 && index>size) {
            System.out.println("Invalid index");
        }
        else{
            Node temp=head;
            int i=1;
            while(i<index-1){
                temp=temp.next;
                i++;
            }
            newnode.prev=temp;
            newnode.next=temp.next;
            temp.next.prev=newnode;
            temp.next=newnode;
        }
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("list is empty");
        }
        else if(head==tail){
            head=tail=null;
        }
        else{
            head=head.next;
        }
        size--;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("list is empty");
        }
        else if(head==tail){
            head=tail=null;
        }
        else{
            tail=tail.prev;
            tail.next=null;
        }
        size--;
    }
    public void deleteAtposition(int index){
            if(index==1){
                deleteFirst();
            }
            else if(index==size){
                deleteLast();
            }
            else{
                Node temp=head;
                int i=1;
                while(i<index){
                    temp=temp.next;
                    i++;
                }
                temp.prev.next=temp.next;
                temp.next.prev=temp.prev;
            }
            size--;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public static void main(String[]args){
        doubleLinkedList list = new doubleLinkedList();
        list.insertFirst(12);
        list.insertLast(23);
        list.insertFirst(45);
        list.insertAtPosition(34,2);
        list.insertLast(13);
        list.insertAtPosition(33,3);
        list.insertLast(133);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.deleteAtposition(3);
        list.display();
    }
}
