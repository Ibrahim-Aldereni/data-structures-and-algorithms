public class Main {

  public static int BinarySearch(int[] arr, int key) {
    int middleIndex = (int) Math.ceil(arr.length / 2) - 1;
    int lastIndex = arr.length - 1;
    int keyIndex = -1;
    int previousMiddleIndex = 0;

    while (middleIndex > 0 && lastIndex - middleIndex > 0) {
      if (arr[middleIndex] < key) { // right
        previousMiddleIndex = middleIndex;
        double y = lastIndex - middleIndex;
        double x = Math.ceil(y / 2);
        middleIndex = (int) x + middleIndex;
        if (middleIndex == lastIndex && arr[lastIndex] == key) {
          keyIndex = lastIndex;
          break;
        }
      } else if (arr[middleIndex] > key) { // left
        lastIndex = middleIndex;
        middleIndex = ((int) Math.ceil(lastIndex - previousMiddleIndex) / 2) + previousMiddleIndex;
      } else if (arr[middleIndex] == key) {
        keyIndex = middleIndex;
        break;
      }
    }

    return keyIndex;
  }

  public static void main(String[] args) {
    int arr[] = {-131, -82, 0, 27, 42, 68, 179};
    System.out.println(BinarySearch(arr, 42));
  }
}
