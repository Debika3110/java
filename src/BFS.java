import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
import java.util.ArrayList;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
public class BFS {
    List<List<Integer>>levelorder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelsize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelsize);
            for (int i = 0; i < levelsize; i++) {
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentLevel);
        }

        return result;
    }

        public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        BFS bfs = new BFS();
        List<List<Integer>> result = bfs.levelorder(root);

        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }
}
