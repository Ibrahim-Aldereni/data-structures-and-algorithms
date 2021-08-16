package trees;

public class NodeQueue<T> {
  public T value;
  public NodeQueue<T> next;

  public NodeQueue(T value) {
    this.value = value;
  }
}
