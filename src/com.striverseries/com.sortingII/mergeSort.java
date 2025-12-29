public class mergeSort {
  public static void main(String[] args) {
      int arr[]={3,2,4,1,9,12,10};
      mergesort(arr,0,arr.length-1);
  }
  public static void mergesort(int [] arr,int left,int right){
    if(left>=right){
      return;
    }
    int mid=left+(right-left)/2;
    mergesort(arr,left,mid);
    mergesort(arr, mid+1, right);
    merge(arr,left,mid,right);
  }
  public static void merge(int[] arr,int left,int mid,int right){
    
  }
}
