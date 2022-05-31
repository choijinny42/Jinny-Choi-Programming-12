package com.zaremba.graphs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static ArrayList<Node> graph;
    public static void main(String[] args) throws FileNotFoundException {
        setupTree();
        BFS();
//        Node start = graph.get(0);
//        for (Integer n : start.getNodes()) {
//            System.out.println(n);
//        }
    }

    private static Node getNode(int num) {
        for (Node n : graph) {
            if (n.getKey() == num) {
                return n;
            }
        }
        return null;
    }

    private static void BFS() {
        //Method that returns a node based on node number
        //Your code here.  Feel free to modify signature or add helper functions.
        //get first node,
        Node start = graph.get(0);
        // add it to a linkedList
        LinkedList<Node> queue = new LinkedList<Node>();
        queue.add(start);

        //while(likkedlist is not empty){
        //print out the node, mark as visisted loop through connecting nodes and if they have no tbeen added to linked list as long as they have not been visited
        while(!queue.isEmpty()) {
            Node current = queue.pollFirst();
            current.setVisited(true);
            System.out.println(current);
            for(Integer num : current.getNodes()) {
                Node node = getNode(num);
                if(!node.isVisited()){
                    queue.add(node);
                    node.setVisited(true);
                }
            }

        }
    }


    private static void setupTree() throws FileNotFoundException {
        graph = new ArrayList<>();
        Scanner scan = new Scanner(new File("tree.txt"));
        while(scan.hasNext()){
            String line = scan.nextLine();
            parseLine(line);
        }
    }

    private static void parseLine(String line) {
        String[] keys = line.split(" ");
        int key = Integer.parseInt(keys[0]);
        ArrayList<Integer> points = new ArrayList<>();
        for(int i = 1; i < keys.length;i++){
            points.add(Integer.parseInt(keys[i]));
        }
        graph.add(new Node(key, points));
    }
}
