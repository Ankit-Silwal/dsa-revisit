
import java.util.Arrays;

public class bubbleSort {
  public static void main(String[] args) {
      int [] arr={4,5,9,1,2,30,3};
      for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1;j++){
          if(arr[j]>arr[j+1]){
            arr[j]=arr[j]^arr[j+1];
            arr[j+1]=arr[j]^arr[j+1];
            arr[j]=arr[j]^arr[j+1];
          }
        }
      }
      System.out.print(Arrays.toString((arr)));
  }
}
