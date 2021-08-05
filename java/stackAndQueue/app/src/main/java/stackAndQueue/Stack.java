package stackAndQueue;

public class Stack<T> {
  public Node top; // generic type (accept any data type)

  //////////////////////////////////// challenge 10 ///////////////////////////////////
  public void push(T value) {
    Node newNode = new Node(value);
    if (top == null) {
      top = newNode;
    } else {
      newNode.next = top;
      top = newNode;
    }
  }

  public T pop() throws Exception {
    T poped = null;
    if (top == null) {
      throw new Exception("stack is empty");
    } else {
      poped = (T) top.value;
      top = top.next;
    }
    return poped;
  }

  public T peek() throws Exception {
    if (top == null) {
      throw new Exception("stack is empty");
    } else {
      return (T) top.value;
    }
  }

  public boolean isEmpty(){
    return top == null;
  }
}
