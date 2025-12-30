public class duplicateWithNeg {
  public static void main(String[] args) {
      int[] arr={1,-1,2,-2,3,-3,4,5,-5};
      System.out.println(unique(arr));
  }
  static int unique(int[] arr){
    int sum=0;
    for(int i=0;i<arr.length;i++){
      sum+=arr[i];
    }
    return sum;
  }
}
