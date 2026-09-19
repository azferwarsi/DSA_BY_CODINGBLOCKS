package Stack;

public class Stack_01{
  private int[] arr;
  // private int curSize;
  private int maxSize;
  private int top;

  public Stack_01(int maxSize){
    arr=new int[maxSize];
    this.top=1;
    // this.curSize=0;
    this.maxSize=maxSize;
    
  }

  public void push(int data){
      if(top==maxSize-1){
        System.out.println("can't push die to stack ovrflow");
        return;
      }
      top++;
      arr[top]=data;
  }

  public int peak(){
      return arr[top];
  }
  public int pop(){
      if(isEmpty()){
        System.out.println("cant pop");
        return -1;
      }
      int topEl=arr[top];
      top--;
      return topEl;
  }
  public int size(){
    return top+1;
  }

   public boolean isEmpty(){
      return top==-1;
   }
}
