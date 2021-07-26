import java.lang.*;
public class Main {

  public static int[] insertShiftArray(int[] arr, int value) {
    int newArr[] = new int[arr.length + 1];
    int middleIndex = (int) Math.ceil((double) arr.length/2);

    for (int i = 0; i < newArr.length; i++) {
      if (middleIndex == i) {
        newArr[i] = value;
      }else{
        if(i > middleIndex){
          newArr[i]=arr[i-1];
        }else{
          newArr[i]=arr[i];
        }
      }
    }
    return newArr;
  }

  public static void main(String[] args) {
    int arr[] = {2,4,6,-8};
    for (int i : insertShiftArray(arr, 16)) {
      System.out.println(i);
    }
  }
}
