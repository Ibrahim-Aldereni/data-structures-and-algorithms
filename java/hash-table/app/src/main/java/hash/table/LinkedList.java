package hash.table;

public class LinkedList {
  Node head;
  Node tail;

  void append(Node data) {
    if (head == null) {
      head = data;
      tail = head;
    } else {
      tail.next = data;
      tail = data;
    }
  }
}
