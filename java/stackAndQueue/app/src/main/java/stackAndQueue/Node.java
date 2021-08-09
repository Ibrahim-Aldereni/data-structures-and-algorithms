package stackAndQueue;

public class Node<T> {
  public T value; // generic type (accept any data type)
  public Node<T> next;

  public Node(T value) {
    this.value = value;
  }
}
