public class Node {
  private Node leftChild;
  private Node rightChild;
  private int value;

  public Node(int value) {
    this.leftChild = null;
    this.rightChild = null;
    this.value = value;
  }

  public void setLeftChild(Node leftChild) {
    this.leftChild = leftChild;
  }

  public void setRightChild(Node rightChild) {
    this.rightChild = rightChild;
  }

  public Node getLeftChild() {
    return leftChild;
  }

  public Node getRightChild() {
    return rightChild;
  }

  public int getValue() {
    return value;
  }

  public boolean hasLeftChild() {
    return leftChild != null;
  }

  public boolean hasRightChild() {
    return rightChild != null;
  }

  @Override
  public String toString() {
    return String.valueOf(getValue());
  }
}
