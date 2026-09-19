package Stack;

public class Stack_02 {
  public static void main(String[] args) {
    Stack_01 stk=new Stack_01(5);
    stk.push(3);
    System.out.println("peek "+stk.peak());
    stk.push(1);
     System.out.println("peek "+stk.peak());
    stk.push(2);
     System.out.println("peek "+stk.peak());
    stk.push(6);
     System.out.println("peek "+stk.peak());
     stk.push(8);
     System.out.println("peek "+stk.peak());
      stk.push(4);
      System.out.println("peek "+stk.peak());
       stk.push(11);
       System.out.println("peek "+stk.peak());

    int poppedEl=stk.pop();
     System.out.println("popped "+poppedEl);
      System.out.println("peek"+stk.peak());
  }
}
