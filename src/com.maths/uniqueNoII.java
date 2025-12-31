//here number is either occuring 3 times 5 times just like odd no find the unique number appearing only one time
public class uniqueNoII {
  public static void main(String[] args) {
      int[] arr={1,1,1,2,2,2,3,3,4,4,4,5,5,5,3,6,7,7,7};
      System.out.print(unique(arr));
  }
  //Big O of n^2 method
  static int unique(int[] arr){
    for(int num:arr){
      int count=0;
      for(int dummy:arr){
        if((num^dummy)==0){
          count++;
        }
      }
      if(count%3!=0){
        return num;
      }
    }
    return -1;
  }
}
