public class Pattern15 {
  public static void main(String[] args) {
    //character pattern 3
    char i,j, count='A';
    for(i='A';i<='E';i++){
      for(j='A';j<=i;j++){
        System.out.print(count);
        count++;
      }
      System.out.println();
    }
  }
}
