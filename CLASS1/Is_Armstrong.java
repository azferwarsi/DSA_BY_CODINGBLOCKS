import java.util.Scanner;

public class Is_Armstrong{
  public static int countofdigit(int n){
    int count=0;
    while(n>0){
      count++;
      n=n/10;
    }
    return count;
  }

  public static boolean IsArmstrong(int n){
    int c=countofdigit(n);
    int sum=0;
    int p=n;
    while(n>0){
      int rem=n%10;
      sum=(int) (sum+Math.pow(rem,c));
      n=n/10;
    }
    if(sum==p){
      return true;
    }
    else{
      return false;
    }
  }
  public static void main(String[] args) {
    System.out.println("Enter any number");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(IsArmstrong(n));
    
  }
}