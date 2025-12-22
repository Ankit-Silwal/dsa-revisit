class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
      int s=0,e=mountainArr.length()-1;
      int peak=0;
      while(s<e){
        int m=s+(e-s)/2;
        if(mountainArr.get(m)>mountainArr.get(m+1)){
          e=m;
        }else{
          s=m+1;
        }
      }
      peak=s;
      if(search(0,peak,target,mountainArr)!=-1){
        return search(0,peak,target,mountainArr);
      }else{
        return search(peak+1,mountainArr.length()-1,target,mountainArr);
      }
    }
    int search(int s,int e,int target,MountainArray mountainArr){
      while(s<=e){
        int m=s+(e-s)/2;
        if(mountainArr.get(m)==target){
          return m;
        }
        if(mountainArr.get(0)>mountainArr.get(1)){
          if(mountainArr.get(m)>target){
            s=m+1;
          }else{
            e=m-1;
          }
        }else{
          if(mountainArr.get(m)>target){
            e=m-1;
          }else{
            s=m+1;
          }
        }
      }
      return -1;
    }
}