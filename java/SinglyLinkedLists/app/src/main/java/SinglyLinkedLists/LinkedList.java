package SinglyLinkedLists;

public class LinkedList {
  Node head;
  Node tail;

  // insert (add to end)
  void insert(int data) {
    Node newData = new Node(data); // create node with the number
    if (head == null) { // if the list is empty make this number the head and the tail
      head = newData;
      tail = head;
    } else {
      tail.next = newData;
      tail = newData;
    }
  }

  // includes
  boolean includes(int data) {
    boolean out = false;
    Node current = head;

    while (current != null) {
      if (data == current.data) {
        out = true;
      }
      current = current.next;
    }
    return out;
  }

  //to string
  String toStr() {
    String out = "";
    Node current = head;

    if (head == null) {
      out = "list is empty";
    }

    while (current != null) {
      out += "{ " + current.data + " } -> ";
      current = current.next;
    }

    out += "NULL";
    return out;
  }
}
