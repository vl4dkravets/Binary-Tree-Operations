package Tree_Min_Value;

import app.Node;

import java.util.LinkedList;
import java.util.Queue;

public class TreeMinValue {
    public static int treeMinValue(Node root) {
        Queue<Node> queue = new LinkedList<>();
        Integer min = Integer.MAX_VALUE;

        queue.add(root);
        while(!queue.isEmpty()) {
            Node current = queue.poll();
            if(current.getValue() < min)   min = current.getValue();

            if(current.getLeft() != null) queue.add(current.getLeft());
            if(current.getRight() != null) queue.add(current.getRight());
        }

        return min;
    }

    public static int treeMinValueRecursively(Node root) {
        if(root == null) return Integer.MAX_VALUE;
        else return Math.min(
                        root.getValue(),
                        Math.min(treeMinValueRecursively(root.getLeft()),
                                treeMinValueRecursively(root.getLeft())
                        )
                    );
    }
}
