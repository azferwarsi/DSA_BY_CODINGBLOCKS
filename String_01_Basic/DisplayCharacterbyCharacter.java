package String_01_Basic;

public class DisplayCharacterbyCharacter {
  public static void main(String[] args) {
    String str="java";
    for(int i=0;i<str.length();i++){
      System.out.println(str.charAt(i));
    }
  }
}
