public class reverse_sll {
    private Node head;
    private Node temp;
    private int size;

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insertfst(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
        }
        newnode.next = head;
        head = newnode;
        size++;
    }

    public void insertLast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
        }
        temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.next = null;
        size++;
    }

    public void insertPos(int data, int index){
        if(index == 0){
            insertfst(data);
            return;
        }
        if(index == size){
            insertLast(data);
            return;
        }
        if(index < 0 || index > size){
            System.out.println("Invalid index");
            return;
        }
        temp = head;
        for(int i = 0; i < index-1; i++){
            temp = temp.next;
        }
        Node newnode = new Node(data);
        newnode.next = temp.next;
        temp.next = newnode;
        size++;
    }

    public void display(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        temp = head;
        while(temp!= null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }


    public void reverse() {
        if (head == null) {
            return; // If the list is empty, there's nothing to reverse
        }

        Node prev = null;
        Node current = head;
        Node nextNode;

        while(current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        head = prev;
    }


    public static void main(String[] args){
        reverse_sll list = new reverse_sll();
        list.insertfst(1);
        list.insertfst(2);
        list.insertPos(3, 2);
        list.insertLast(4);
        list.insertLast(5);
        System.out.println("Original List:");
        list.display();

        list.reverse();
        System.out.println("Reversed List:");
        list.display();
    }
}
