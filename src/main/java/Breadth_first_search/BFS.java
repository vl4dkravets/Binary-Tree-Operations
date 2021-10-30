package Breadth_first_search;

import app.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static ArrayList<Integer> bfs(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        while(!queue.isEmpty()) {
            Node current = queue.poll();
            result.add(current.getValue());

            if(current.getLeft() != null)   queue.add(current.getLeft());
            if(current.getRight() != null)   queue.add(current.getRight());
        }

        return result;
    }
}
