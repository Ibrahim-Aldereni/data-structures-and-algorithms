package stackAndQueue;

public class PseudoQueue<T> {
  public Stack<T> stack1;
  public Stack<T> stack2;

  public PseudoQueue() {
    this.stack1 = new Stack<>();
    this.stack2 = new Stack<>();
  }

  public void enqueue(T value) {
    stack1.push(value);
  }

  public T dequeue() throws Exception {
    while (stack1.top != null){
      stack2.push(stack1.pop()); // reverse stack1 in stack2
    }

    T out = stack2.pop(); // remove last element in stack1 (first element in stack 2)

    while (stack2.top != null){ // return stack 1 after deleting the element
      stack1.push(stack2.pop());
    }
   return out;
  }

  @Override
  public String toString() {
    String out = "";
    Node current = stack1.top;
    while (current != null){
      out+="["+current.value+"]->";
      current = current.next;
    }
    out+="NULL";
    return out;
  }
}
