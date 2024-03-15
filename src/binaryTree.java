
import java.util.Scanner;
public class binaryTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    Node root;
    public void populate(Scanner scanner){
       System.out.println("Enter the root Node: ");
       int data= scanner.nextInt();
       root=new Node(data);
       populate(scanner,root);
    }
    public void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left of " +node.data);
        boolean left= scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left:  " +node.data);
            int data=scanner.nextInt();
            node.left= new Node(data);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to enter right of " +node.data);
        boolean right= scanner.nextBoolean();
        if(right) {
            System.out.println("Enter the value of the right:  " + node.data);
            int data = scanner.nextInt();
            node.right = new Node(data);
            populate(scanner, node.right);
        }
    }
    public void display(){

        display(root, "");
    }
    public void display(Node node, String indent){
        if(node==null){
            return;
        }
        System.out.println(indent + node.data);
        display(node.left,  indent +"\t");
        display(node.right,  indent + "\t");
    }
    public void prettydisplay(){
        prettydisplay(root,0);
    }
    public void prettydisplay(Node node,int level){
        if(node==null){
            return;
        }
        prettydisplay(node.right,level+1);
        if(level!=0){
            for(int i=0;i<level-1;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|------>"+node.data);
        }
        else {
            System.out.println(node.data);
        }
        prettydisplay(node.left,level+1);

    }
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        binaryTree tree = new binaryTree();
        tree.populate(scanner);
        tree.display();
        tree.prettydisplay();
    }

}
