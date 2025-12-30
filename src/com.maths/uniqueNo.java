public class uniqueNo {
  public static void main(String[] args) {
    int[] arr={1,2,3,1,2,4,4,5,6,6,5};
    System.out.print(unique(arr));  
  }
  static int unique(int[] arr){
    int result=0;
    for(int i=0;i<arr.length;i++){
      result=result^arr[i];
    }
    return result;
  }
}
