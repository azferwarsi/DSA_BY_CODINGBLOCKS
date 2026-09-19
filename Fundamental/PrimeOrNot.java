package Fundamental;

public class PrimeOrNot {
  public static boolean isPrime(int n){
     for(int i=2;i<n;i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    int n=37;
    boolean isPrimeNo=isPrime(n);
    if(isPrimeNo==true){
      System.out.println("Prime no");
    }
    else{
      System.out.println("Not prime no");
    }
}
}

