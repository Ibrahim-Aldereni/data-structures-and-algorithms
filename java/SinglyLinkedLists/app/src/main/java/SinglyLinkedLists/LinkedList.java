package SinglyLinkedLists;

public class LinkedList {
  Node head;
  Node tail;

  ////////////////////////////////// code challenge 05 methods ////////////////////////////////
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

  ///////////////////////////////// code challenge 06 methods ////////////////////////////////////
  void append(int data) {
    Node newData = new Node(data); // create node with the number
    if (head == null) { // if the list is empty make this number the head and the tail
      head = newData;
      tail = head;
    } else {
      tail.next = newData;
      tail = newData;
    }
  }

  void insertBefore(int value, int newValue) {
    if (head != null) { // if the list is empty do not do anything
      if (value == head.data) { // if the value is the head,insert the newValue before head and make it the head
        Node newData = new Node(newValue);
        newData.next = head;
        head = newData;
      } else { // if the value is ont the head we loop through the list to find the value
        Node current = head;
        Node previousCurrent = current;
        while (current != null) {
          if (value == current.data) {
            Node newData = new Node(newValue); // make the new value as node
            newData.next = current; // new value will point to the next
            previousCurrent.next = newData; // previous value will point to the new value
          }
          previousCurrent = current;
          current = current.next;
        }
      }
    }
  }

  void insertAfter(int value, int newValue) {
    if (head != null) { // if the list is empty do not do anything
      if (value == tail.data) { // if the value is the tail, insert the newValue after tail and make it the tail
        Node newData = new Node(newValue);
        tail.next = newData;
        tail = newData;
      } else {
        Node current = head; //2
        Node nextCurrent = current.next; //5
        while (current != null) {
          if (value == current.data) {
            Node newData = new Node(newValue); // make the new value as node
            newData.next = nextCurrent;
            current.next = newData;
            break;
          }
        /*
        the below if else statement to stop the loop if the number not exist and to prevent
         assign a null value to nextCurrent node
         */
          if (current.next != null) {
            current = current.next;
            nextCurrent = current.next;
          } else {
            current = current.next;
          }
        }
      }
    }
  }

  ///////////////////////////////// code challenge 07 methods ////////////////////////////////////
  // this method is not required but i need it in the below method
  int size() {
    int size = 0;
    Node current = head;
    while(current != null){
      size++;
      current = current.next;
    }
    return size;
  }

  int kthFromEnd(int value) throws Exception {
    if(value < 0 || value >= size()){
      throw new Exception("number bigger than or equal list size or it's minus");
    }
    int elementIndex = size() - value;
    Node current = null;

    if(elementIndex > 0){
      current = head;
      for (int i = 1; i < elementIndex; i++) {
        current = current.next;
      }
    }

    return current.data;
  }
}

