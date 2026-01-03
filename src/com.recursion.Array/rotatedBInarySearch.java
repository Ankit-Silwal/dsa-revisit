public class rotatedBInarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,10,1,2,3};
        System.out.println(search(arr, 1)); // output: 7
    }

    static int search(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (arr[m] == target) {
                return m;
            }
            // LEFT half is sorted
            if (arr[s] <= arr[m]) {
                if (target >= arr[s] && target < arr[m]) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }
           // RIGHT half is sorted
            else {
                if (target > arr[m] && target <= arr[e]) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            }
        }
        return -1;
    }
}
