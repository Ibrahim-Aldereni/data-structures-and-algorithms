# Trees

- Trees consist of:
  - Node - A Tree node is a component which may contain it’s own values, and references to other nodes
  - Root - The root is the node at the beginning of the tree
  - K - A number that specifies the maximum number of children any node may have in a k-ary tree. In a binary tree, k = 2.
  - Left - A reference to one child node, in a binary tree
  - Right - A reference to the other child node, in a binary tree
  - Edge - The edge in a tree is the link between a parent and child node
  - Leaf - A leaf is a node that does not have any children
  - Height - The height of a tree is the number of edges from the root to the furthest leaf

## Challenge

- Challenge 15 >> Implement Binary Tree class with (pre order, in order and post order) methods, and Binary Search Tree with (add and contains) methods.

- Challenge 16 >> Create a method to find the Maximum Value in a Binary Tree

- Challenge 17 >> Create a method to do Breadth-first Traversal.

- Challenge 18 >> Conduct “FizzBuzz” on a k-ary tree while traversing through it to create a new tree.

## Approach & Efficiency

- Challenge 15

  - Time: O(1)
  - Space: O(n)

- Challenge 16

  - Time: O(1)
  - Space: O(n)

- Challenge 17

  - Time: O(n)
  - Space: O(n)

- Challenge 18

  - Time: O(n)
  - Space: O(n)

## API

- Challenge 15

  - **pre order** >> print trees content in (root >> left >> right) order.
  - **in order** >> print trees content in (left >> root >> right) order.
  - **post order** >> print trees content in (left >> right >> root) order.
  - **add** >> Adds a new node with that value in the correct location in the binary search tree.
  - **contains** >> return boolean indicating whether or not the value is in the tree at least once.

- Challenge 16

  - **max** >> Find the maximum value stored in the tree.

- Challenge 17

  - **breadth first** >> return list of all values in the tree, in Breadth-first approach

- Challenge 18

  - **fizz buzz tree** >> return k-ary of fizz,buzz and fizzBuzz values
