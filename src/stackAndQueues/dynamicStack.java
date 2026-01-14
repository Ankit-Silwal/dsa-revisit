package stackAndQueues;

import java.util.Arrays;

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
      data = Arrays.copyOf(data, data.length * 2);
    }
    return super.push(item);    
  }
} 
