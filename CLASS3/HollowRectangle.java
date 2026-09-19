package CLASS3;

import java.util.Scanner;

public class HollowRectangle {
  public static void main(String[] args) {
    
  
  int i,j,k;
  for(i=1;i<=10;i++){
    if(i==1 || i==10){
      for(j=1;j<=10;j++){
        System.out.print("*");
      }
      System.out.println();
    }
    else{
      System.out.print("*");
      for(k=1;k<=8;k++){
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println();
    }
  }

  
}
}
