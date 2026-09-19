package CLASS1;

import java.util.Scanner;

public class AreaOfTriangle {
  public static void main(String[] args) {
    int a,b,c;
    System.out.println("Enter value for sides of triangle");
     Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    int s=(a+b+c)/2;

    Double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.println(area);

  }
}
