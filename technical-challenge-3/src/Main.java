public class Main {
  public static void main(String[] args) {
//    Node root = new Node(1);
//    Node two = new Node(2);
//    Node three = new Node(3);
//
//    three.setLeftChild(new Node(4));
//    two.setLeftChild(three);
//    root.setLeftChild(two);



    Node root = new Node(5);
    Node seven = new Node(7);
    Node eight = new Node(8);
    Node nine = new Node(9);

    nine.setLeftChild(new Node(15));
    nine.setRightChild(new Node(10));
    eight.setLeftChild(nine);
    seven.setLeftChild(new Node(12));
    seven.setRightChild(eight);
    root.setLeftChild(new Node(6));
    root.setRightChild(seven);



//    Node root = new Node(1);
//    Node node = new Node(2);
//    node.setLeftChild(new Node(4));
//    root.setLeftChild(node);
//    root.setRightChild(new Node(3));

    System.out.println(getPath(root, 1, 1));

  }


  public static int getPath(Node tree, int path, int maxPath) {
    if (tree.hasLeftChild()) {
      if (tree.getLeftChild().getValue() == tree.getValue() + 1) {
        path++;
        if (path > maxPath) {
          maxPath = path;
        }
      } else {
        path = 1;
      }
      maxPath =  getPath(tree.getLeftChild(), path, maxPath);
    }
    if (tree.hasRightChild()) {
      if (tree.getRightChild().getValue() == tree.getValue() + 1) {
        path++;
      }
      if (path > maxPath) {
        maxPath = path;
      }
      else {
        path = 1;
      }
      maxPath =  getPath(tree.getRightChild(), path, maxPath);
    }
    return maxPath;
  }
}
