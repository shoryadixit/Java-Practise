import java.util.*;

public class GraphTutorial {
    public static void bfsTraversal(int node, boolean[] visitedNode, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> traverse) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visitedNode[node] = true;

        while (!q.isEmpty()) {
            int frontNode = q.poll();
            traverse.add(frontNode);

            for (int x : adj.get(frontNode)) {
                if (!visitedNode[x]) {
                    visitedNode[x] = true;
                    q.add(x);
                }
            }
        }
    }

    public static void dfsTraversal(int node, boolean[] visitedNode, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> traverse) {
        visitedNode[node] = true;
        traverse.add(node);

        for (int neighbour : adj.get(node)) {
            if (!visitedNode[neighbour]) {
                dfsTraversal(neighbour, visitedNode, adj, traverse);
            }
        }
    }

    public static void dfs(int node, boolean[] visitedNode, Stack<Integer> stack, ArrayList<ArrayList<Integer>> adj) {
        visitedNode[node] = true;

        for (int neighbour : adj.get(node)) {
            if (!visitedNode[neighbour]) {
                dfs(neighbour, visitedNode, stack, adj);
            }
        }

        stack.push(node);
    }

    public static ArrayList<ArrayList<Integer>> makeAdjacencyList(ArrayList<ArrayList<Integer>> edges, int v) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < v; i++) {
            int x = edges.get(i).get(0);
            int y = edges.get(i).get(1);
            adj.get(x).add(y);
        }

        return adj;
    }

    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> edges, int v) {
        ArrayList<ArrayList<Integer>> adj = makeAdjacencyList(edges, v);

        boolean[] visitedNode = new boolean[v];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < v; i++) {
            if (!visitedNode[i]) {
                dfs(i, visitedNode, stack, adj);
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        while (!stack.isEmpty()) {
            res.add(stack.pop());
        }

        return res;
    }

    public static boolean detectCycleBFS(int node, boolean[] visitedNode, ArrayList<ArrayList<Integer>> adj) {
        // Detect cycle in undireceted graph
        HashMap<Integer, Integer> p = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();

        p.put(node, -1);
        visitedNode[node] = true;
        q.add(node);

        while (!q.isEmpty()) {
            int frontNode = q.poll();
            for (int neighbour : adj.get(frontNode)) {
                if (visitedNode[neighbour] && p.get(frontNode) != neighbour) {
                    return true;
                } else if (!visitedNode[neighbour]) {
                    visitedNode[neighbour] = true;
                    q.add(neighbour);
                    p.put(neighbour, frontNode);
                }
            }

        }
        return false;
    }

    public static boolean detectCycleDFS(int node, boolean[] visitedNode, int parent, ArrayList<ArrayList<Integer>> adj) {
        visitedNode[node] = true;
        for (int neighbour : adj.get(node)) {
            if (!visitedNode[neighbour]) {
                if (detectCycleDFS(neighbour, visitedNode, node, adj)) {
                    return true;
                }
            } else if (neighbour != parent) {
                return true;
            }
        }

        return false;
    }

    public static boolean detectCycleDirectedDFS(int node, boolean[] visitedNode, boolean[] recStack, ArrayList<ArrayList<Integer>> adj) {
        visitedNode[node] = true;
        recStack[node] = true;

        for (int neighbour : adj.get(node)) {
            if (!visitedNode[neighbour]) {
                if (detectCycleDirectedDFS(neighbour, visitedNode, recStack, adj)) {
                    return true;
                }
            } else if (recStack[neighbour]) {
                return true;
            }
        }

        recStack[node] = false;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of vertices");
        int v = sc.nextInt();

        System.out.println("Enter the number of edges");
        int e = sc.nextInt();

        ArrayList<ArrayList<Integer>> edges = new ArrayList<>(v + 1);

        System.out.println("Enter the edges!");
        for (int i = 0; i < e; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            edges.add(new ArrayList<>(Arrays.asList(x, y)));
        }

        ArrayList<Integer> result = topologicalSort(edges, v);
        System.out.println(result); // Expected Output: [0, 1, 2, 3]

        ArrayList<Integer> traverse = new ArrayList<>();
        boolean[] visitedNodes = new boolean[v + 1];
        ArrayList<ArrayList<Integer>> adj = makeAdjacencyList(edges, v);

        for (int i = 0; i < v; i++) {
            if (!visitedNodes[i]) {
                bfsTraversal(i, visitedNodes, adj, traverse);
            }
        }

        System.out.println("BFS Traversal ==> ");
        System.out.println(traverse); // Expected Output: [0, 1, 2, 3]

        traverse.clear();
        visitedNodes = new boolean[v + 1];
        System.out.println("DFS Traversal ==> ");
        for (int i = 0; i < v; i++) {
            if (!visitedNodes[i]) {
                dfsTraversal(i, visitedNodes, adj, traverse);
            }
        }
        System.out.println(traverse); // Expected Output: [0, 1, 2, 3]

        traverse.clear();
        visitedNodes = new boolean[v + 1];

        System.out.println("Detect Cycle in a graph ==> ");
        for (int i = 0; i < v; i++) {
            if (!visitedNodes[i]) {
                boolean ans = detectCycleBFS(i, visitedNodes, adj);
                if (ans) {
                    System.out.println("Cycle Detected!");
                    break;
                } else {
                    System.out.println("No Cycle Detected!");
                }
            }
        }

        traverse.clear();
        visitedNodes = new boolean[v + 1];

        System.out.println("Detect Cycle in a graph using DFS ==> ");
        for (int i = 0; i < v; i++) {
            if (!visitedNodes[i]) {
                boolean ans = detectCycleDFS(i, visitedNodes, -1, adj);
                if (ans) {
                    System.out.println("Cycle Detected!");
                    break;
                } else {
                    System.out.println("No Cycle Detected!");
                }
            }
        }

        visitedNodes = new boolean[v + 1];
        boolean[] recStack = new boolean[v + 1];
        boolean ans = false;
        System.out.println("Detect Cycle in a directed graph using DFS ==> ");
        for (int i = 0; i < v; i++) {
            if (!visitedNodes[i]) {
                ans = detectCycleDirectedDFS(i, visitedNodes, recStack, adj);
                if (ans) {
                    System.out.println("Cycle Detected!");
                    break;
                }
            }
        }

        if (!ans) System.out.println("No Cycle Detected!");
    }
}