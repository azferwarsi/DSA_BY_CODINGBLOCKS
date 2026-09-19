public class Pattern5 {
  public static void main(String[] args) {
    // inverted right angle traingle
    int i,j;
    for(i=1;i<=5;i++){
      for(j=5;j>=i;j--){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
