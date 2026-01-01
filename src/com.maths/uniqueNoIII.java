public class uniqueNoIII {
  public static void main(String[] args) {
    int[] nums = {1,2,1,3,2,5};
    int[] res = singleNumber(nums);
    System.out.println(res[0] + " " + res[1]);
  }

  static int[] singleNumber(int[] nums) {
    int xor = 0;
    for (int num : nums) {
      xor ^= num;
    }
    int diffBit = xor & (-xor);
    int a = 0;
    int b = 0;
    for (int num : nums) {
      if ((num & diffBit) != 0) {
        a ^= num;
      } else {
        b ^= num;
      }
    }
    return new int[]{a, b};
  }

  /*
  Test Case 1:
  Input:  [1,2,1,3,2,5]
  Output: [3,5]

  Test Case 2:
  Input:  [-1,2147483647]
  Output: [-1,2147483647]

  Test Case 3:
  Input:  [4,1,2,1,2,3]
  Output: [4,3]

  Test Case 4:
  Input:  [0,1]
  Output: [0,1]

  Test Case 5:
  Input:  [-5,-3,-5,-4]
  Output: [-3,-4]
  */
}
