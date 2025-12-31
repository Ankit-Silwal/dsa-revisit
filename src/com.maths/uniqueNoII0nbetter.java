public class uniqueNoII0nbetter {
  public static void main(String[] args) {
    int[] arr={1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,7,7,7,8,8,8,9,9,9};
    System.out.print(unique(arr));  
  }
  static int unique(int[] arr){
    int result=0;
    for(int bit=0;bit<32;bit++){
      int count=0;
      for(int num:arr){
        if((num&(1<<bit))!=0){
          count++;
        }
      }
      if(count%3!=0){
        result|=(1<<bit);
      }
    }
    return result;
  }
}