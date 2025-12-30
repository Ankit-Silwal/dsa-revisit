
import java.util.Arrays;

public class BubbeSort {

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 2, 3, 2, 45, 33};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr) {
        //run the steps n-1 times 
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                //comparision logic (Swap only if the items is smaller than previos than smlaler item)
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }
}
