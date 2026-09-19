package RECURSION;

public class Print_5_to_1 {
  public static void PrintNto1(int n){

    // base case
    if(n==0){
      return;
    }

    // self work
    System.out.println(n);

    // recursive call
    PrintNto1(n-1);
  }
  public static void main(String[] args) { 
    int n=5;
    PrintNto1(n);
  }
}
