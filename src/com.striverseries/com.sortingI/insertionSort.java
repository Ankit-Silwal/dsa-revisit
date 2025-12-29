import java.util.Arrays;

public class insertionSort {

    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 1, 2, 9, 23, 21};
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.print(Arrays.toString((arr)));
    }
}
