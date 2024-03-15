import java.util.Scanner;

public class BTS {
    static class Node{
        int value;
        int height;
        Node left;
        Node right;


        public Node(int value){
                this.value=value;
                this.left=null;
                this.right=null;
        }
        public int getvalue(){
            return value;
        }
    }
    Node root;
    public void BST(){

    }
    public int height(Node node){
        if(node==null){
            return -1;
        }
        else{
            return node.height;
        }
    }
    public boolean isempty(){
        return root==null;
    }
    public void insert(int value){
        root=insert(value,root);
    }
    public Node insert(int value,Node node){
        if(node==null){
            node=new Node(value);
            return node;
        }
        if(value<node.value){
            node.left=insert(value,node.left);
        }
        if(value>node.value){
            node.right=insert(value,node.right);
        }
        node.height=Math.max(height(node.left),height(node.right)+1);
        return node;
    }
    public boolean balanced(){
        return balanced(root);
    }
    public boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1&&balanced(node.left)&&balanced(node.right);
    }
    public void populate(int[]nums){
        for(int i=0;i<nums.length;i++){
            this.insert(nums[i]);
        }
    }
    public void populateSorted(int[]nums){
        populatedSorted(nums,0,nums.length);
    }
    public void populatedSorted(int[]nums,int start,int end){
        if(start>=end){
            return;
        }
        int mid=(start+end)/2;

        this.insert(nums[mid]);
        populatedSorted(nums,start,mid);
        populatedSorted(nums,mid+1,end);

    }
    public void preOrder(){
        preOrder(root);
    }
    public void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);

    }
    public void inOrder(){
        inOrder(root);
    }
    public void inOrder(Node node){
        if(node==null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);

    }
    public void postOrder(){
        postOrder(root);
    }
    public void postOrder(Node node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    public void display(){
        display(root,"Root Node : ");
    }
    public void display(Node node,String details){
        if (node==null){
            return;
        }
        System.out.println(details + node.value);
        display(node.left,"left child of " + node.value+" : ");
        display(node.right,"right child of " + node.value+" : ");
    }
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        BTS tree = new BTS();
        int[] nums={1,2,3,4,5,6,7,8,9};
        tree.populateSorted(nums);
        tree.display();
        tree.balanced();
        tree.isempty();
        // Printing the results of balanced() and isempty() methods
        System.out.println("Is the tree balanced? " + tree.balanced());
        System.out.println("Is the tree empty? " + tree.isempty());

        tree.preOrder();
        System.out.println( " ");
        tree.inOrder();
        System.out.println( " ");
        tree.postOrder();


    }
}
