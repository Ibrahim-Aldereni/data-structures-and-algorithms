package trees;

public class Queue<T> {
  public NodeQueue<T> front;
  public NodeQueue<T> rear;

  //////////////////////////////////// challenge 10 ///////////////////////////////////
  public void enqueue(T value) {
    NodeQueue<T> newNode = new NodeQueue<>(value);
    if (front == null) {
      front = newNode;
      rear = newNode;
    } else {
      rear.next = newNode;
      rear = newNode;
    }
  }

  public T dequeue() throws Exception {
    T dequeued = null;
    if (front == null) {
      throw new Exception("queue is empty");
    } else {
      dequeued = (T) front.value;
      front = front.next;
    }
    return dequeued;
  }

  public T peek() throws Exception {
    if (front == null) {
      return null;
    } else {
      return front.value;
    }
  }

  public boolean isEmpty(){
    return front == null;
  }
}
