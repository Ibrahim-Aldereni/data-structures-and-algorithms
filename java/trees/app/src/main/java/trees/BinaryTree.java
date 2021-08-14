package trees;

import java.util.ArrayList;
import java.util.List;

public abstract class BinaryTree<T> {
  private List<T> list = new ArrayList<>();
  //////////////////////////////////////// challenge 15 ////////////////////////////////////////////////
  public List<T> preOrder(Node<T> root) {
    list.add(root.value);

    if (root.left != null) preOrder(root.left);

    if (root.right != null) preOrder(root.right);

    return list;
  }

  public List<T> inOrder(Node<T> root) {

    if (root.left != null) inOrder(root.left);

    list.add(root.value);

    if (root.right != null) inOrder(root.right);

    return list;
  }

  public List<T> postOrder(Node<T> root) {

    if (root.left != null) postOrder(root.left);

    if (root.right != null) postOrder(root.right);

    list.add(root.value);

    return list;
  }
}
