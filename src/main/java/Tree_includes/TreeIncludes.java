package Tree_includes;

import app.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TreeIncludes {
    public static boolean treeIncludes(Node root, Integer target) {
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        while(!queue.isEmpty()) {
            Node current = queue.poll();
            if (current.getValue() == target) { return true; }

            if(current.getLeft() != null)   queue.add(current.getLeft());
            if(current.getRight() != null)   queue.add(current.getRight());
        }

        return false;
    }

    public static boolean treeIncludesRecursive(Node root, Integer target) {
        if(root == null) return false;
        if(root.getValue() == target) return true;
        return treeIncludesRecursive(root.getLeft(), target) || treeIncludesRecursive(root.getRight(), target);
    }
}
