package hash.table;

public class LinkedList {
  Node head;
  Node tail;

  void append(int data) {
    Node newData = new Node(data);
    if (head == null) {
      head = newData;
      tail = head;
    } else {
      tail.next = newData;
      tail = newData;
    }
  }
}
