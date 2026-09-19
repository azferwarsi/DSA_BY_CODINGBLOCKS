package String_01_Basic;

public class DisplayInReverseOrder {
  public static void main(String[] args) {

    // display string in reverse order
    String str="azfer";
    for(int i=str.length()-1;i>=0;i--){
      System.out.print(str.charAt(i));
    }
  }
}
