// Name: Kunjan

import java.util.*;

public class RouteOptimizer
{
    static class Edge
    {
        int destination;
        int distance;

        Edge(int destination, int distance)
        {
            this.destination = destination;
            this.distance = distance;
        }
    }

    static class Node
    {
        int location;
        int distance;

        Node(int location, int distance)
        {
            this.location = location;
            this.distance = distance;
        }
    }

    public static void main(String[] args)
    {
        int locations = 6;

        List<List<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < locations; i++)
        {
            graph.add(new ArrayList<>());
        }

        addRoad(graph, 0, 1, 4);
        addRoad(graph, 0, 2, 2);
        addRoad(graph, 1, 2, 1);
        addRoad(graph, 1, 3, 5);
        addRoad(graph, 2, 3, 8);
        addRoad(graph, 2, 4, 10);
        addRoad(graph, 3, 4, 2);
        addRoad(graph, 3, 5, 6);
        addRoad(graph, 4, 5, 3);

        int start = 0;
        int destination = 5;

        int[] distances = new int[locations];
        int[] previous = new int[locations];

        Arrays.fill(distances, Integer.MAX_VALUE);
        Arrays.fill(previous, -1);

        PriorityQueue<Node> queue = new PriorityQueue<>(
            Comparator.comparingInt(node -> node.distance)
        );

        distances[start] = 0;
        queue.offer(new Node(start, 0));

        while (!queue.isEmpty())
        {
            Node current = queue.poll();

            if (current.distance > distances[current.location])
            {
                continue;
            }

            for (Edge edge : graph.get(current.location))
            {
                int newDistance =
                    current.distance + edge.distance;

                if (newDistance < distances[edge.destination])
                {
                    distances[edge.destination] = newDistance;
                    previous[edge.destination] = current.location;

                    queue.offer(
                        new Node(edge.destination, newDistance)
                    );
                }
            }
        }

        System.out.println("==============================");
        System.out.println("       ROUTE OPTIMIZER");
        System.out.println("==============================");

        if (distances[destination] == Integer.MAX_VALUE)
        {
            System.out.println("No route exists.");
            return;
        }

        List<Integer> path = new ArrayList<>();

        for (int current = destination;
             current != -1;
             current = previous[current])
        {
            path.add(current);
        }

        Collections.reverse(path);

        System.out.println("Start: " + start);
        System.out.println("Destination: " + destination);
        System.out.println("Shortest distance: " + distances[destination]);

        System.out.print("Route: ");

        for (int i = 0; i < path.size(); i++)
        {
            System.out.print(path.get(i));

            if (i < path.size() - 1)
            {
                System.out.print(" -> ");
            }
        }

        System.out.println();
    }

    static void addRoad(
        List<List<Edge>> graph,
        int from,
        int to,
        int distance)
    {
        graph.get(from).add(new Edge(to, distance));
        graph.get(to).add(new Edge(from, distance));
    }
}