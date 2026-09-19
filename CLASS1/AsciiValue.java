package CLASS1;

import java.util.Scanner;

public class AsciiValue {
  public static void main(String[] args) {
    //AScii value of a character
    System.out.println("Enter any character");
    char ch;
    
    Scanner sc=new Scanner(System.in);
    ch=sc.next().charAt(0);
    int a=ch;
    System.out.println("ASCII valur of " +ch+ " is "+a);
  }
}
