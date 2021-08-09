package AnimalShelter;

import stackAndQueue.Node;

public class AnimalShelter<Animal> {
  public Node<Animal> front;
  public Node<Animal> rear;

  public void enqueue(Animal animal){
    Node<Animal> newAnimal= new Node<>(animal);
    if (front == null) {
      front = newAnimal;
      rear = newAnimal;
    } else {
      rear.next = newAnimal;
      rear = newAnimal;
    }
  }

  public Animal dequeue(String pref) throws Exception {
    Animal dequeued = (Animal) new Dog("null"); // to return null if the pref is not exist

    if (front == null) {
      throw new Exception("queue is empty");
    } else {
      String frontAnimalType = front.value.getClass().getSimpleName().toLowerCase();
      if(pref.toLowerCase().equals("dog") && frontAnimalType.equals("dog")){
        dequeued = front.value;
        front = front.next;
      }else if(pref.toLowerCase().equals("cat") && frontAnimalType.equals("cat")){
        dequeued = front.value;
        front = front.next;
      }else{
        while (front != null){
          if(pref.toLowerCase().equals(front.value.getClass().getSimpleName().toLowerCase())){
            dequeued = front.value;
            front = front.next;
            break;
          }
          front = front.next;
        }
      }
    }
    return dequeued;
  }
}
