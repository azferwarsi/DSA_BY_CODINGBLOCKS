import java.util.Scanner;

public class Prime_or_not {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number");
    int n=sc.nextInt();
    int count=0;
    for(int i=2;i<n;i++){
      if(n%i==0){
        count++;
      }
    }
    if(count>=1){
      System.out.println("Not prime");
    }
    else{
      System.out.println("Prime number");
    }
  }
}
