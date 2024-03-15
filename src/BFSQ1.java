


//if you are given a node find the right most next node to the given node :


import java.util.LinkedList;
import java.util.Queue;

class TreeNodee {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNodee(int x) {
        val = x;
    }
}

public class BFSQ1 {
    public TreeNode findsuccessior(TreeNode root, int key) {

        if (root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
            if (currentNode.val == key) {
                break;
            }
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        BFSQ1 bfs = new BFSQ1();
        TreeNode result = bfs.findsuccessior(root, 20);

        if (result != null) {
            System.out.println("Rightmost next node to the node with value 20 is: " + result.val);
        } else {
            System.out.println("No rightmost next node found.");
        }
    }
}
