
public class armstrong {
  public static void main(String[] args) {
    int n = 153;
    checkArmstrong(n);
  }

  static void checkArmstrong(int n) {
    int temp = n;
    int count = 0;
    while (temp != 0) {
      temp /= 10;
      count++;
    }

    temp = n;
    int sum = 0;
    while (temp != 0) {
      int rem = temp % 10;
      sum += Math.pow(rem, count);
      temp /= 10;
    }

    String s = Integer.toString(n);

    if (sum == n) {
      for (int i = 0; i < s.length(); i++) {
        if (i % 2 == 0) {
          System.out.print(s.charAt(i) + " ");
        }
      }
    } else {
      for (int i = 0; i < s.length(); i++) {
        if (i % 2 != 0) {
          System.out.print(s.charAt(i) + " ");
        }
      }
    }
  }
}
