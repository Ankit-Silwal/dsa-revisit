
import java.util.Arrays;

public class SelectionSort {
  public static void main(String[] args) {
      int [] arr={23,4,6,1,123,3,445,5,9034,9000};
      selectionSort(arr);
      System.out.println(Arrays.toString(arr));
  }
  static void selectionSort(int[] arr){
    for(int i = 0; i < arr.length - 1; i++){
      int minIndex = i;
      for(int j = i + 1; j < arr.length; j++){
        if(arr[j] < arr[minIndex]){
          minIndex = j;
        }
      }
      int temp = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = temp;
    }
  }
}
