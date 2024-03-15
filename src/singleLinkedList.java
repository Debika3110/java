public class singleLinkedList {
    private Node head;
    private Node tail;
    private int size;
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void insertFirst(int data){
        Node newnode=new Node(data);
       if(head==null){
           head=tail=newnode;
       }
       else{
           newnode.next=head;
           head=newnode;
       }
       size++;
    }
    public void insertLast(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.next=null;
        }
        size++;
    }
    public void insertAtPosition(int data,int index){
        if(index==0){
            insertFirst(data);
            return;
        }
        if(index==size){
            insertLast(data);
            return;
        }
        if(index<0 || index>size){
            System.out.println("invalid index");
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node newnode=new Node(data);
        newnode.next= temp.next;
        temp.next=newnode;
        size++;
    }
    public int deleteFirst(){
        if(head==null){
            System.out.println("list is empty");
            return -1;
        }
        else if(head==tail){
            head=tail=null;
        }
        else{
            head=head.next;
        }
        size--;
        if(size==0){
            tail=null;
        }
        return 0;
    }
    public int deleteLast(){
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        } else if (head == tail) {
            head = tail = null;
            size--;
            return 0;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
        size--;
        return 0;
    }

    public int deleteAtposition(int index){

        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return -1;
        }

        if (index == 0) {
            return deleteFirst();
        } else if (index == size - 1) {
            return deleteLast();
        }

        int i = 1;
        Node temp = head;
        while (i < index) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        size--;
        return 0;
    }
    public int findsNode(int data){
        Node node=head;
        while(head!=null){
            if(node.data==data) {
                return 1;
            }
            node=node.next;
        }
        return 0;
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
        singleLinkedList list=new singleLinkedList();
        list.insertFirst(13);
        list.insertFirst(133);
        list.insertFirst(144);
        list.display();
        list.insertLast(66);
        list.insertLast(67);
        list.display();
        list.insertAtPosition(24,3);
        list.display();
        list.deleteAtposition(3);
        list.display();
        list.deleteLast();
        list.display();
        list.deleteFirst();
        list.display();

    }
}
