package com.joy.assignment7;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== TESTING CUSTOM DEQUE ===");
        CustomDeque<Integer> deque = new CustomDeque<>();

        deque.addLast(10);
        deque.addLast(20);
        deque.addFirst(5);
        deque.addFirst(1);

        deque.printDeque(); // Expected: 1 5 10 20

        System.out.println("Removed First: " + deque.removeFirst()); // 1
        System.out.println("Removed Last: " + deque.removeLast());   // 20

        deque.printDeque(); // Expected: 5 10

        System.out.println("\n=== TESTING CUSTOM GRAPH ===");
        CustomGraph<String> graph = new CustomGraph<>();

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "D");
        graph.addEdge("C", "E");

        graph.printGraph();

        System.out.println();
        graph.bfs("A");
        graph.dfs("A");
    }
}