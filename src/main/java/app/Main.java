package app;

import Breadth_first_search.BFS;
import Count_Avg_of_Each_Level.AvgLevels;
import Depth_first_search.DFS;
import Max_Path_Sum.MaxPathSum;
import Tree_Min_Value.TreeMinValue;
import Tree_includes.TreeIncludes;
import Tree_sum.TreeSum;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        /*
                a
               / \
              b   c
             / \   \
            d   e   f

        */

        a.setLeft(b);
        a.setRight(c);
        b.setLeft(d);
        b.setRight(e);
        c.setRight(f);

        System.out.println("");

        System.out.println("\t\t        1");
        System.out.println("\t\t       / \\");
        System.out.println("\t\t      2   3");
        System.out.println("\t\t     / \\   \\");
        System.out.println("\t\t    4   5   6");

        System.out.println("");

        System.out.println("--Depth First Search (DFS)-----------------------------------");
        System.out.println("\t" + DFS.dfs(a));

        System.out.println("\n--Breadth First Search (BFS)----------------------------------");
        System.out.println("\t" + BFS.bfs(a));

        System.out.println("\n--Tree-Includes-----------------------------------------------");
        int value1 = 6;
        int value2 = 50;
        int value3 = 5;
        int value4 = 49;
        System.out.println("\tIs value " + value1 + " present in the tree: " + TreeIncludes.treeIncludes(a, value1));
        System.out.println("\tIs value " + value2 + " present in the tree: " + TreeIncludes.treeIncludes(a, value2));
        System.out.println("\tIs value " + value3 + " present in the tree (recursively): " + TreeIncludes.treeIncludesRecursive(a, value3));
        System.out.println("\tIs value " + value4 + " present in the tree (recursively): " + TreeIncludes.treeIncludesRecursive(a, value4));

        System.out.println("\n--Tree-Sum----------------------------------------------------");
        System.out.println("\tSum of the tree is: " + TreeSum.treeSum(a));
        System.out.println("\tSum of the tree is (recursively): " + TreeSum.treeSumRecursively(a));

        System.out.println("\n--Tree-Min-Value-----------------------------------------------");
        System.out.println("\tMin value of the tree is: " + TreeMinValue.treeMinValue(a));
        System.out.println("\tMin value of the tree is (recursively): " + TreeMinValue.treeMinValueRecursively(a));

        System.out.println("\n--Max-Path-Sum-------------------------------------------------");
        System.out.println("\tMax path sum of the tree is (recursively): " + MaxPathSum.maxPathSumRecursively(a));

        System.out.println("\n--Avg of Each Tree Level (using DEPTH-first-search approach)----");
        List<Double> list = AvgLevels.countAvgEachLevelDfs(a);
        for(int i = 0; i < list.size(); i++) {
            System.out.printf("\tAverage of level %d is %s%n", i, list.get(i));
        }

        System.out.println("\n--Avg of Each Tree Level (using BREADTH-first-search approach)--");
        list = AvgLevels.countAvgEachLevelBfs(a);
        for(int i = 0; i < list.size(); i++) {
            System.out.printf("\tAverage of level %d is %s%n", i, list.get(i));
        }


    }
}
