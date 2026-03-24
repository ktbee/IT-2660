import java.util.ArrayList;

//import BST.TreeNode;

class Main {
  public static void main(String[] args) {

    // Step 1 - Create a BST tree object called lab5Tree
    BST lab5Tree = new BST();

    // Step 2 - Insert the following values: 13, 22, 36, 5, 48, 17, 39, 2, 26, 40, 29, 34, 10
    int[] nums = {13, 22, 36, 5, 48, 17, 39, 2, 26, 40, 29, 34, 10};
    for (int num : nums) {
      lab5Tree.insert(num);
    }

    // Step 3 - Delete the value 17
    lab5Tree.delete(17);

    // Step 4 - Traverse and output the values using inorder (sorted)
    System.out.println("Outputing BST values using in order");
    lab5Tree.inorder();
    System.out.println("\n");

    // Step 5 - Traverse and output the values using postorder
    System.out.println("Outputing BST values using postorder");
    lab5Tree.postorder();
    System.out.println("\n");

    // Step 6 - Traverse and output the values using preorder
    System.out.println("Outputing BST values using preorder");
    lab5Tree.preorder();
    System.out.println("\n");

    // Step 7 - Display the result of a search for the value 36
    boolean valFound = lab5Tree.search(36);
    System.out.println("36 found in the tree: " + valFound);

    // Step 8 - Display the result of a search for the value 37
    valFound = lab5Tree.search(37);
    System.out.println("37 found in the tree: " + valFound);

    // Step 9 - Using the path() method, display the path from the root to 2
    ArrayList<BST.TreeNode<Integer>> nodePath = lab5Tree.path(2);
    System.out.println("Path to the value 2 in the BST: ");
    for (BST.TreeNode<Integer> node : nodePath) {
      System.out.print(node.element + " ");
    }
    System.out.println("\n");


    // Step 10 - Display the path from the root to 34
    nodePath = lab5Tree.path(34);
    System.out.println("Path to the value 34 in the BST: ");
    for (BST.TreeNode<Integer> node : nodePath) {
      System.out.print(node.element + " ");
    }
    System.out.println("\n");

  }
}
