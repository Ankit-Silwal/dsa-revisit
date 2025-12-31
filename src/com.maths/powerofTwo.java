//here for any number of two it takes format of
// 10000000,10000,00001000 and if we subtract them by one it becomes
// 01111111,01111,00000111 thus when we do and between them we get 0 thus this is the required logic
// but 0 is an exception case in this logic which we need to take care of
public class powerofTwo {
  public static void main(String[] args) {
      System.out.print(poweroftwo(3));
      System.out.print(poweroftwo(4));
      System.out.print(poweroftwo(6));
      System.out.print(poweroftwo(16));
  }
  static boolean poweroftwo(int num){
    return (num & (num - 1)) == 0 && num > 0;
  }
}
