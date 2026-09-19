package RECURSION;

public class N_th_Fibonacci {

  public static int fibonacci(int n){
    // if(n==0){
    //   return 0;
    // }
    // if(n==1){
    //   return 1;
    // }

    if(n==0 || n==1){
      return n;
    }
    return fibonacci(n-1)+fibonacci(n-2);
  }
  public static void main(String[] args) {
      int n=6;
      System.out.println(fibonacci(n));
  }
}
