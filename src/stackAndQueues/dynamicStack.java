public class dynamicStack extends customStack {
  public dynamicStack(){
    super();//it will call custom stack with only declaration
  }
  public dynamicStack(int size){
    super(size);//it will call the custom stack with size
  }

  @Override
  public boolean push(int item){
    if(this.isFull()){
      //double the array size
      int[] temp=new int[data.length*2];
      for(int i=0;i<data.length;i++){
        temp[i]=data[i];
      }
      data=temp;
    }
    return super.push(item);    
  }
} 
