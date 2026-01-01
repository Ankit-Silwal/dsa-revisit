public class hamiltonDistance {
  //hamilton distance count no of different bit for like
  // 3 -011
  //4  -100
  //hamilton bit is 3
//and for 
// 1-0001
// 3-0011
//hamilton bit is 1 cause only 1 bit is different
  public static void main(String[] args) {
    System.out.println(distance(1345785533, 234337937));    
    System.out.println(distance(4, 5));
    System.out.println(distance(9, 23));  
    System.out.println(distance(42435, 34234));  
    System.out.println(distance(4245425, 55423543));  
  
  }
  static int distance(int num1,int num2){
    int count=0;
    for(int bit=0;bit<32;bit++){
      if((((num1>>bit)&1)^(((num2>>bit)&1)))!=0){
        count++;
      }
    }
    return count;
  }  
}
