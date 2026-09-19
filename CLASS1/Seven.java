package CLASS1;

import java.util.Scanner;

public class Seven {
  public static void main(String[] args) {
    // switch case
    int a,b,ch;
    int c;
    System.out.println("Enter any two number");
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    b=s.nextInt();
    System.out.println("Enter your choice");
    ch=s.nextInt();

    switch (ch) {
      case 1: c=a+b;
      System.out.println("Addition "+c);
        break;
        case 2: c=a-b;
      System.out.println("Subtraction "+c);
        break;
        case 3: c=a*b;
      System.out.println("Multiplication "+c);
        break;
        case 4: c=a/b;
      System.out.println("Division "+c);
        break;
        case 5: c=a%b;
      System.out.println("Remainder "+c);
        break;
    
      default: 
        System.out.println("Invalid choice");
        break;
    }

  }
}
