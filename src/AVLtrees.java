import java.util.Scanner;

public class AVLtrees {
        static class Node{
            int value;
            int height;
            Node left;
            Node right;


            public Node(int value){
                this.value=value;
                this.left=null;
                this.right=null;
                this.height=0;
            }
            public int getvalue(){
                return value;
            }
        }
        Node root;
        public AVLtrees(){
            root=null;
        }
        public int height(){
            return height(root);
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
        public Node insert(int value, Node node){
            if(node==null){
                node=new Node(value);
                return node;
            }
            if(value<node.value){
                node.left=insert(value,node.left);
            }
            else if(value>node.value){
                node.right=insert(value,node.right);
            }
            else{
                return node;
            }
            node.height=1+Math.max(height(node.left),height(node.right));
            return rotate(node);
        }
        public Node rotate(Node node){
            if (node == null) return null;
            if(height(node.left)-height(node.right)>1){
                //left is heavy
                if(height(node.left.left)-height(node.left.right)>0){
                    //left left case
                    return rightrotate(node);
                }
                if(height(node.left.left)-height(node.left.right)<0){
                    //left right case
                    node.left=leftrotate(node.left);
                    return rightrotate(node);
                }
            }
            if(height(node.left)-height(node.right) < -1){
                //right is heavy
                if(height(node.right.left)-height(node.right.right)<0){
                    //right right case
                    return leftrotate(node);
                }
                if(height(node.right.left)-height(node.right.right)>0){
                    //right left case
                    node.right=rightrotate(node.right);
                    return leftrotate(node);
                }
            }
            return node;

        }

        public Node rightrotate(Node p){
            if (p == null || p.left == null) return p;
            Node c=p.left;
            Node t=c.right;

            c.right=p;
            p.left=t;

            p.height=Math.max(height(p.left),height(p.right)+1);
            c.height=Math.max(height(c.left),height(c.right)+1);

            return c;
        }
        public Node leftrotate(Node c){
            if (c == null || c.right == null) return c;
            Node p=c.left;
            Node t=p.left;


            p.left=c;
            c.right=t;

            p.height=Math.max(height(p.left),height(p.right)+1);
            c.height=Math.max(height(c.left),height(c.right)+1);

            return p;
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
        public void display(Node node, String details){
            if (node==null){
                return;
            }
            System.out.println(details + node.value);
            display(node.left,"left child of " + node.value+" : ");
            display(node.right,"right child of " + node.value+" : ");
        }
        public static void main(String[]args) {
            Scanner scanner = new Scanner(System.in);
            AVLtrees tree = new AVLtrees();
            int[] nums={12,8,5,3,2,1};
            tree.populateSorted(nums);
            tree.display();
            tree.balanced();
            tree.isempty();
            tree.preOrder();
            // Printing the results of balanced() and isempty() methods
            System.out.println("Is the tree balanced? " + tree.balanced());
            System.out.println("Is the tree empty? " + tree.isempty());

            System.out.println( " ");
            tree.inOrder();
            System.out.println( " ");
            tree.postOrder();


        }
    }


