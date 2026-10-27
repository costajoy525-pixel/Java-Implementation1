package com.joy.assignment7;

import java.util.*;

public class CustomGraph<T> {

    private final Map<T, List<T>> adjacencyList = new HashMap<>();

    public void addVertex(T vertex) {
        adjacencyList.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(T source, T destination) {
        addVertex(source);
        addVertex(destination);
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    public void bfs(T startVertex) {
        if (!adjacencyList.containsKey(startVertex)) return;

        Set<T> visited = new HashSet<>();
        Queue<T> queue = new LinkedList<>();

        visited.add(startVertex);
        queue.add(startVertex);

        System.out.print("BFS Traversal: ");
        while (!queue.isEmpty()) {
            T current = queue.poll();
            System.out.print(current + " ");

            for (T neighbor : adjacencyList.get(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    public void dfs(T startVertex) {
        if (!adjacencyList.containsKey(startVertex)) return;

        Set<T> visited = new HashSet<>();
        System.out.print("DFS Traversal: ");
        dfsHelper(startVertex, visited);
        System.out.println();
    }

    private void dfsHelper(T current, Set<T> visited) {
        visited.add(current);
        System.out.print(current + " ");

        for (T neighbor : adjacencyList.get(current)) {
            if (!visited.contains(neighbor)) {
                dfsHelper(neighbor, visited);
            }
        }
    }

    public void printGraph() {
        System.out.println("--- Graph Adjacency List ---");
        for (Map.Entry<T, List<T>> entry : adjacencyList.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}