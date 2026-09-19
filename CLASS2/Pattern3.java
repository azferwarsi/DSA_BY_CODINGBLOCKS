public class Pattern3 {
  public static void main(String[] args) {
    //inverted right angle triangle 
    int i,j,k;
    for(i=1;i<=5;i++){ //raws
      for(j=i;j<5;j++){   //space
        System.out.print(" ");
      }
      for(k=1;k<=i;k++){  //column
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
