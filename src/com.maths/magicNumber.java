//magic number is coveritng binary to 5 and power like for 1,2,3,magic no 
// 1-001-5^1=5
// 2-010-5^2=25
// 3-011-5^2+5^1=30
// 4-100-5^3=125
// 5-101-5^3+5^1=130
// 6-110-5^3+5^2=150
// 7-111-5^3+5^2+5^1=155

public class magicNumber {
  public static void main(String[] args) {
      System.out.println(find(6));
      System.out.println(find(20));
      System.out.println(find(31));
      System.out.println(find(22));
  }
  static int find(int num){
    int ans=0;
    int pow=1;
    for(int bit=0;bit<32;bit++){
      if((num&(1<<bit))!=0){
        ans+=Math.pow(5, pow);
      }
      pow++;
    }
    return ans;
  }
}
