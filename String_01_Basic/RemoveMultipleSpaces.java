package String_01_Basic;

public class RemoveMultipleSpaces {
  public static void main(String[] args) {
    String str="This   is   a   string";
    System.out.println(str);
   str=str.replaceAll("\\s+"," ");
   System.out.println(str);

  }
}
