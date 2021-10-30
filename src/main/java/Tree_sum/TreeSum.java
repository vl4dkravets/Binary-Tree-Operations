package Tree_sum;

import app.Node;

import java.util.LinkedList;
import java.util.Queue;

public class TreeSum {
    public static int treeSum(Node root) {
        int sum = 0;
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        while(!queue.isEmpty()) {
            Node current = queue.poll();
            sum += current.getValue();

            if(current.getLeft() != null)   queue.add(current.getLeft());
            if(current.getRight() != null)   queue.add(current.getRight());
        }

        return sum;
    }

    public static int treeSumRecursively(Node root) {
        if (root == null) return 0;
        return root.getValue() + treeSumRecursively(root.getLeft()) + treeSumRecursively(root.getRight());
    }
}
