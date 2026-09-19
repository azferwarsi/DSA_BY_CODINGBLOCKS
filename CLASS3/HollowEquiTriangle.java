package CLASS3;

import java.util.Scanner;

public class HollowEquiTriangle {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int line=1;line<=n;line++){
      for(int space=1;space<=n-line; space++){
        System.out.print(" ");
      }
      if(line==1 || line==n){
        for(int star=1;star<=line;star++){
          System.out.print("* ");
        }
      }
      else{
        System.out.print("*");
        for(int space=1;space<=2*line-3;space++){
          System.out.print(" ");
        }
        System.out.print("* ");

      }
      System.out.println();
    }
  }
}
