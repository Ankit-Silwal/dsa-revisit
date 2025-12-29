public class sortedMatrix {
  public static void main(String[] args) {
      
  }
  //search in the row provided shit for the 2 dimension matrix which is already sorted
  static int[] binarySearch(int [][] matrix,int row,int cStart,int cEnd,int target){
    while(cStart<=cEnd){
      int mid=cStart+(cEnd-cStart)/2;
      if(matrix[row][mid]==target){
        return new int[] {row,mid};
      }
      else if(matrix[row][mid]<target){
        cEnd=mid-1;
      }else{
        cStart=mid+1;
      }
    }
    return new int[] {-1,-1};
  }
  static int[] search(int[][] matrix,int target){
    int rows=matrix.length;
    int cols=matrix[0].length;
    if(rows==1){
      return binarySearch(matrix, 0, 0, cols-1, target);
    }
    int rStart=0;
    int rEnd=rows-1;
    int cMid=cols/2;
    //run the loop till two rows are remaining
    while()
  }
}
