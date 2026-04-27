import java.util.List;

class Main {
  public static void main(String[] args) {
    // 1. Define the vertices (buildings) based on the campus map
    String[] vertices = {
      "Liberal Arts",
      "Student Services",
      "Health Careers & Sciences",
      "Health Technologies Center",
      "Recreation Center",
      "Technology Learning Center",
      "Business & Technology",
      "Theatre"
    };
    // 2-Define Edges
    // Assuming paths are bidirectional
    int[][] edges = {
      {0,1},
      {1,0},
      {1,6},
      {6,1},
      {0,7},
      {7,0},
      {0,6},
      {6,0},
      {1,5},
      {5,1},
      {1,2},
      {2,1},
      {2,3},
      {3,2},
      {4,2},
      {2,4},
      {6,7},
      {7,6}

    };
    // 3. Create the graph (name "graph") using the vertices and edges
    UnweightedGraph<String> graph = new UnweightedGraph<>(vertices, edges);

    // 4. Perform a depth-first search (name "dfs")(DFS) starting from the "Business & Technology" building
    UnweightedGraph<String>.SearchTree dfs = graph.dfs(6);

    // 5. Retrieve and print the search order of the DFS traversal
    List<Integer> searchOrders = dfs.getSearchOrder();

    for (int i = 0; i < searchOrders.size(); i++) {
      int parent = dfs.getParent(i);
      System.out.print("Vertice: " + graph.getVertex(searchOrders.get(i)) + "\n");

      // 6. Print the parent-child relationships for each vertex during the DFS traversal
      if (parent != -1) {
        System.out.print("Vertice Parent: " + graph.getVertex(dfs.getParent(i)));
      } else {
        System.out.print("Vertice parent: none");
      }

      System.out.print("\n\n");
    }

    // 7. Call the printPath method (assuming this method exists in the UnweightedGraph class)
    dfs.printPath(3);
    System.out.println("\n");
    dfs.printPath(1);
    System.out.println("\n");
    dfs.printPath(4);
    System.out.println("\n");

    // 8. Call printTree() to print the entire DFS tree (assuming this method exists in the UnweightedGraph class)
    System.out.println("Print the entire search tree:");
    dfs.printTree();
  }
}
