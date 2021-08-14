/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  //////////////////////////////////////// challenge 15 ////////////////////////////////////////////////
  // 1- Can successfully instantiate an empty tree
  @Test
  void testTree() {
    BinarySearchTree<Integer> tree = new BinarySearchTree<>();
    assertNull(tree.root);
  }

  // 2- Can successfully instantiate a tree with a single root node
  @Test
  void testTree2() {
    BinarySearchTree<Integer> tree = new BinarySearchTree<>();
    tree.add(10);
    assertEquals(10,tree.root.value);
  }

  // 3- Can successfully add a left child and right child to a single root node
  @Test
  void testTree3() {
    BinarySearchTree<Integer> tree = new BinarySearchTree<>();
    tree.add(10);
    tree.add(2);
    tree.add(20);
    assertEquals(10,tree.root.value);
    assertEquals(2,tree.root.left.value);
    assertEquals(20,tree.root.right.value);
  }

  // 4- Can successfully return a collection from a preorder traversal
  @Test
  void testTree4() {
    BinarySearchTree<Integer> tree = new BinarySearchTree<>();
    tree.add(10);
    tree.add(20);
    tree.add(8);
    tree.add(5);
    tree.add(9);
    tree.add(30);
    tree.add(15);
    // output must be
    List list = Arrays.asList(10, 8, 5, 9, 20, 15, 30);
    assertEquals(list,tree.preOrder(tree.root));
  }

  // 5- Can successfully return a collection from an inorder traversal
  @Test
  void testTree5() {
    BinarySearchTree<Integer> tree = new BinarySearchTree<>();
    tree.add(10);
    tree.add(20);
    tree.add(8);
    tree.add(5);
    tree.add(9);
    tree.add(30);
    tree.add(15);
    // output must be
    List list = Arrays.asList(5, 8, 9, 10, 15, 20, 30);
    assertEquals(list,tree.inOrder(tree.root));
  }

  // 6- Can successfully return a collection from a postorder traversal
  @Test
  void testTree6() {
    BinarySearchTree<Integer> tree = new BinarySearchTree<>();
    tree.add(10);
    tree.add(20);
    tree.add(8);
    tree.add(5);
    tree.add(9);
    tree.add(30);
    tree.add(15);
    // output must be
    List list = Arrays.asList(5, 9, 8, 15, 30, 20, 10);
    assertEquals(list,tree.postOrder(tree.root));
  }
}
