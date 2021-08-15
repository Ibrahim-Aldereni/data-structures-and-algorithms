package trees;

public class BinarySearchTree<T> extends BinaryTree<T> {
  public BinarySearchTree() {
  }

  //////////////////////////////////////// challenge 15 ////////////////////////////////////////////////
  // used for "public" add function
  private Node add(Node root, T value) {
    if (root == null) {
      root = new Node(value);
      return root;
    }
    if ((Integer) value < (Integer) root.value) root.left = add(root.left, value);
    else if ((Integer) value > (Integer) root.value) root.right = add(root.right, value);

    return root;
  }

  public void add(T value) {
    root = add(root, value);
  }

  /// used for "public" contains function
  private boolean contains(Node root, T value) {
    if (value == root.value) {
      return true;
    } else if ((Integer) value > (Integer) root.value && root.right != null) {
      return contains(root.right, value);
    } else if ((Integer) value < (Integer) root.value && root.left != null) {
      return contains(root.left, value);
    }else{
      return false;
    }
  }

  public boolean contains(T value) {
    return contains(root, value);
  }
}
