package hash.table;

public class HashTable<T> {
  Node[] arrayHash;
  int size;

  public HashTable(int size) {
    this.size = size;
    arrayHash = new Node[size];
    for (int i = 0; i < size; i++) {
      arrayHash[i] = new Node();
    }
  }
  ///////////////////////////////////// challenge 30 ////////////////////////////////////
  public int hash(int key) {
    return key % size;
  }

  public void add(int key, Object value){
    Node newItem = new Node(key,value);
    int hashIndex = hash(key);
    Node arrValue = arrayHash[hashIndex];

    newItem.next = arrValue.next;
    arrValue.next = newItem;
  }

  public T get(int key){
    T output = null;

    int hashIndex = hash(key);
    Node arrValue = arrayHash[hashIndex];

    while (arrValue != null){
      if(arrValue.key == key){
        output = (T) arrValue.value;
        break;
      }
      arrValue=arrValue.next;
    }
    return output;
  }

  public boolean contains(int key){
    boolean output = false;

    int hashIndex = hash(key);
    Node arrValue = arrayHash[hashIndex];

    while (arrValue != null){
      if(arrValue.key == key){
        output = true;
        break;
      }
      arrValue=arrValue.next;
    }
    return output;
  }
}
