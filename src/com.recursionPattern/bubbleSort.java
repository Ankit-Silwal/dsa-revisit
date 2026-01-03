public class bubbleSort {
  public static void main(String[] args) {
      
  }
  static void bubble(int[] arr,int index){
    if(index==arr.length-1){
      return;
    }
    if(arr[index]<arr[index-1]){
      int temp=arr[index];
      arr[index]=arr[index-1];
      arr[index-1]=temp;
    }
  }
}
