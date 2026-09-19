package RECURSION;

public class X_power_n_Optimized {

  public static int power(int x,int n){

    //base case
    if(n==0){
      return 1;
    }

    int half=power(x,n/2);

    //even power
    if(n%2==0){
      return half*half;
    }

    //odd power
    return x*half*half;
  }
  public static void main(String[] args) {
    System.out.println(power(2, 5));
  }
}
