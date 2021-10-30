package Max_Path_Sum;

import app.Node;

import java.util.LinkedList;
import java.util.Queue;

public class MaxPathSum {
    public static int maxPathSumRecursively(Node root) {
        if(root == null)    return Integer.MIN_VALUE;
        if(root.getLeft() == null && root.getRight() == null)   return root.getValue();
        return root.getValue() + Math.max(maxPathSumRecursively(root.getLeft()),maxPathSumRecursively(root.getRight()));
    }
}
