import java.util.Arrays;

public class plusOnesixtysix {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    int[] arr2 = {1,2,9,9};
    int[] arr3 = {9,9,9};
    System.out.println(Arrays.toString(find(arr)));
    System.out.println(Arrays.toString(find(arr2)));
    System.out.println(Arrays.toString(find(arr3)));
  }

  static int[] find(int[] arr) {
    int n = arr.length;
    for (int i = n - 1; i >= 0; i--) {
      if (arr[i] < 9) {
        arr[i]++;
        return arr;
      }
      arr[i] = 0;
    }

    int[] res = new int[n + 1];
    res[0] = 1;
    return res;
  }
}
