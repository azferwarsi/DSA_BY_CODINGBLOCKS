package CLASS1;

import java.util.Scanner;

public class VowelOrNot {
  public static void main(String[] args) {
    System.out.println("Enter the character");
    Scanner sc=new Scanner(System.in);
    char ch=sc.next().charAt(0);
    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'  ){
      System.out.println("character is vowel");
    }
    else{
      System.out.println("character is consonant");
    }
  }
}
