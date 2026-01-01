public class reverseBits {
  public static void main(String[] args) {
    int n = 43261596;
    System.out.println(reverseBits(n));
  }
  // Input: 43261596
  // Output: 964176192
  static int reverseBits(int n) {
    int ans=0;
    for(int bit=31;bit>=0;bit--){
      int temp=((n>>bit)&1);
      if(temp>0){
        ans|=(1<<(31-bit));
      }
    }
    return ans;
  }
}
