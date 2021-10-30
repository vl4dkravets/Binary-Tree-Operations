package Count_Avg_of_Each_Level;

import app.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AvgLevels {
    private static void traverseLevels
            (Node root, int level, List<Double> sums, List<Integer> counts) {
        if (root == null) 	return;

        if (level < sums.size()) {
            sums.set(level, sums.get(level) + root.getValue());
            counts.set(level, counts.get(level) + 1);
        }
        else {
            sums.add(root.getValue() * 1.0);
            counts.add(1);
        }

        traverseLevels(root.getLeft(), level + 1, sums, counts);
        traverseLevels(root.getRight(), level + 1, sums, counts);
    }

    public static List<Double> countAvgEachLevelDfs(Node root) {
        List<Double> sums = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();

        traverseLevels(root, 0, sums, counts);

        for(int i = 0; i < sums.size(); i++) {
            sums.set(i, sums.get(i) / counts.get(i));
        }

        return sums;
    }


    public static List<Double> countAvgEachLevelBfs(Node root) {
        List<Double> sums = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        Queue<Node> specificLevel;

        queue.add(root);
        while(!queue.isEmpty()) {
            specificLevel = new LinkedList<>();
            int nodesPerLevel = 0;
            int sumPerLevel = 0;

            while(!queue.isEmpty()) {
                Node current = queue.poll();
                nodesPerLevel++;
                sumPerLevel += current.getValue();

                if(current.getLeft() != null) specificLevel.offer(current.getLeft());
                if(current.getRight() != null) specificLevel.offer(current.getRight());
            }

            sums.add(sumPerLevel / nodesPerLevel * 1.0);
            queue = specificLevel;
        }

        return sums;

    }
}
