package Depth_first_search;

import app.Node;

import java.util.ArrayList;
import java.util.Stack;

public class DFS {
    public static ArrayList<Integer> dfs(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Node> stack = new Stack<>();

        stack.push(root);
        while(!stack.empty()) {
            Node current = stack.pop();
            result.add(current.getValue());

            if(current.getRight() != null)   stack.push(current.getRight());
            if(current.getLeft() != null)   stack.push(current.getLeft());
        }

        return result;
    }
}
